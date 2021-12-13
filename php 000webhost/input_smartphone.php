<?php
require("koneksi.php");
$data = json_decode(file_get_contents("php://input"), true);

$id_brand = $data['id_brand'];
$gambar_type = $data['gambar_type'];
$nama_type = $data['nama_type'];

$layar_singkat = $data['layar_singkat'];
$kamera_singkat = $data['kamera_singkat'];
$soc_singkat = $data['soc_singkat'];
$battery_singkat = $data['battery_singkat'];
// print_r($data);

if(empty($id_brand || $nama_type || $gambar_type || $layar_singkat || $kamera_singkat || $soc_singkat || $battery_singkat) ) {
    $errMessage = json_encode(array("message" => "Masukkan data !", "status" => false));
    echo $errMessage;
}

if (!isset($errMessage)) {
    $query = mysqli_query($konek, 'INSERT INTO smartphone (id_brand, nama_type, gambar_type, layar_singkat, kamera_singkat, soc_singkat, battery_singkat) VALUES ("'.$id_brand.'","'.$nama_type.'","'.$gambar_type.'","'.$layar_singkat.'","'.$kamera_singkat.'","'.$soc_singkat.'","'.$battery_singkat.'")');
    echo json_encode(array("message" => "Data Berhasil DI Input", "status" => true));
}

?> 