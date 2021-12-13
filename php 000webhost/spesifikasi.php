<?php
require("koneksi.php");
$id_smartphone = $_GET['id_smartphone'];
$perintah = "SELECT * FROM spesifikasi INNER JOIN smartphone ON spesifikasi.id_smartphone = smartphone.id_smartphone where spesifikasi.id_smartphone = $id_smartphone";
// $perintah = "SELECT * FROM spesifikasi INNER JOIN smartphone ON spesifikasi.id_smartphone = $id_smartphone";
$eksekusi = mysqli_query($konek, $perintah);
$cek = mysqli_affected_rows($konek);

if($cek > 0){
    $response["pesan"] = "Data Tampil";
    $response["dataspesifikasi"] = array();

    while($ambil = mysqli_fetch_object($eksekusi)){
        $D["id_spesifikasi"] = $ambil->id_spesifikasi;
        $D["id_smartphone"] = $ambil->id_smartphone;
        $D["nama_type"] = $ambil->nama_type;
        $D["gambar_type"] = $ambil->gambar_type;    
        $D["network"] = $ambil->network;
        $D["launch"] = $ambil->launch;
        $D["body"] = $ambil->body;
        $D["display"] = $ambil->display;
        $D["platform"] = $ambil->platform;
        $D["memory"] = $ambil->memory;
        $D["main_kamera"] = $ambil->main_kamera;
        $D["selfie_kamera"] = $ambil->selfie_kamera;
        $D["sound"] = $ambil->sound;
        $D["comms"] = $ambil->comms;
        $D["feature"] = $ambil->feature;
        $D["battery"] = $ambil->battery;
        $D["misc"] = $ambil->misc;
        $D["layar_singkat"] = $ambil->layar_singkat;
        $D["kamera_singkat"] = $ambil->kamera_singkat;
        $D["soc_singkat"] = $ambil->soc_singkat;
        $D["battery_singkat"] = $ambil->battery_singkat;
        

        array_push($response["dataspesifikasi"], $D);
    }
}else{
    $response["pesan"] = "Data Tidak Tampil";
}

echo json_encode($response);
mysqli_close($konek);

