<?php
require("koneksi.php");
$data = json_decode(file_get_contents("php://input"), true);

$id_smartphone = $data['id_smartphone'];
$gambar_type = $data['gambar_type'];
$nama_type = $data['nama_type'];
$network = $data['network'];
$launch = $data['launch'];
$body = $data['body'];
$display = $data['display'];
$platform = $data['platform'];
$memory = $data['memory'];
$main_kamera = $data['main_kamera'];
$selfie_kamera = $data['selfie_kamera'];
$sound = $data['sound'];
$comms = $data['comms'];
$feature = $data['feature'];
$battery = $data['battery'];
$misc = $data['misc'];
// print_r($data);

if(empty($id_smartphone || $nama_type || $gambar_type || $network || $launch || $body || $display || $platform || $memory || $main_kamera || $selfie_kamera || $sound || $comms || $feature || $battery || $misc) ) {
    $errMessage = json_encode(array("message" => "Masukkan data !", "status" => false));
    echo $errMessage;
}

// echo 'INSERT INTO spesifikasi (id_smartphone, nama_type, gambar_type,network, launch, body, display, platform, memory, main_kamera, selfie_kamera, sound, comms, feature, battery, misc) VALUES ("'.$id_smartphone.'","'.$nama_type.'","'.$gambar_type.'","'.$network.'","'.$launch.'","'.$body.'","'.$display.'","'.$platform.'","'.$memory.'","'.$main_kamera.'", "'.$selfie_kamera.'","'.$sound.'","'.$comms.'","'.$feature.'","'.$battery.'","'.$misc.'")';

if (!isset($errMessage)) {
    $query = mysqli_query($konek, 'INSERT INTO spesifikasi (id_smartphone, nama_type, gambar_type,network, launch, body, display, platform, memory, main_kamera, selfie_kamera, sound, comms, feature, battery, misc) VALUES ("'.$id_smartphone.'","'.$nama_type.'","'.$gambar_type.'","'.$network.'","'.$launch.'","'.$body.'","'.$display.'","'.$platform.'","'.$memory.'","'.$main_kamera.'", "'.$selfie_kamera.'","'.$sound.'","'.$comms.'","'.$feature.'","'.$battery.'","'.$misc.'")');
    
    echo json_encode(array("message" => "Data Berhasil DI Input", "status" => true));
}

?> 