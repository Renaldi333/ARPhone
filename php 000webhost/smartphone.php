<?php
require("koneksi.php");
$id_brand = $_GET['id_brand'];
$perintah = "SELECT * FROM smartphone where id_brand = $id_brand";
$eksekusi = mysqli_query($konek, $perintah);
$cek = mysqli_affected_rows($konek);

if($cek > 0){
    $response["pesan"] = "Data Tampil";
    $response["datasmartphone"] = array();

    while($ambil = mysqli_fetch_object($eksekusi)){
        $D["id_smartphone"] = $ambil->id_smartphone;
        $D["id_brand"] = $ambil->id_brand;
        $D["nama_type"] = $ambil->nama_type;
        $D["gambar_type"] = $ambil->gambar_type;
        $D["layar_singkat"] = $ambil->layar_singkat;
        $D["kamera_singkat"] = $ambil->kamera_singkat;
        $D["soc_singkat"] = $ambil->soc_singkat;
        $D["battery_singkat"] = $ambil->battery_singkat;

        array_push($response["datasmartphone"], $D);
    }
}else{
    $response["pesan"] = "Data Tidak Tampil";
}

echo json_encode($response);
mysqli_close($konek);

