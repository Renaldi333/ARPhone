<?php
header("Content-Type: application/json");
header("Acess-Control-Allow-Origin: *");
header("Acess-Control-Allow-Methods: POST");
header("Acess-Control-Allow-Headers: Acess-Control-Allow-Headers,Content-Type,Acess-Control-Allow-Methods, Authorization");

require("koneksi.php");
$data = json_decode(file_get_contents("php://input"), true);

$id_spesifikasi = $_POST['id_spesifikasi'];
$nama_type = $_POST['nama_type'];
$file = $_FILES['file']['name'];
$tempPathfile = $_FILES['file']['tmp_name'];
$fileSize = $_FILES['file']['size'];

if (empty($file)) {
    $errMessage = json_encode(array("message" => "Masukkan gambar dan file ar !", "status" => false));
    echo $errMessage;
}else{
    $pathfile = 'file/';
    $fileExt = strtolower(pathinfo($file, PATHINFO_EXTENSION));
    $validExtension = array('sfa','sfb');
    if (in_array($fileExt, $validExtension)){
        if (!file_exists($pathfile . $file)){
            if ($fileSize < 5000000){
            move_uploaded_file($tempPathfile, $pathfile . $file);
            } else {
                $errMessage = json_encode(array("message" => "Sorry, your file is too large, please upload 5 MB size", "status" => false));
                echo $errMessage;
            }
        } else {
            $errMessage = json_encode(array("message" => "Sorry, file already exists check upload folder", "status" => false));	
			echo $errMessage;
        }
    } else {
        $errMessage = json_encode(array("message" => "Sorry, only sfa, sfb files are allowed", "status" => false));	
		echo $errMessage;	
    }
}
if (!isset($errMessage)) {
    $query = mysqli_query($konek, 'INSERT INTO augmented_reality (id_spesifikasi, nama_type, file) VALUES ("'.$id_spesifikasi.'","'.$nama_type.'","'.$file.'")');
    echo json_encode(array("message" => "file insert Successfully", "status" => true));	
    }
?>