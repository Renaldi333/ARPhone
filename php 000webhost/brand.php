<?php
require("koneksi.php");
$perintah = "SELECT * FROM brand";
$eksekusi = mysqli_query($konek, $perintah);
$cek = mysqli_affected_rows($konek);

if($cek > 0){
    $response["pesan"] = "Data Tampil";
    $response["databrand"] = array();

    while($ambil = mysqli_fetch_object($eksekusi)){
        $D["id_brand"] = $ambil-> id_brand;
        $D["nama_brand"] = $ambil-> nama_brand;
        $D["img_brand"] = $ambil-> img_brand;

        array_push($response["databrand"], $D);
    }
}else{
    $response["pesan"] = "Data Tidak Tampil";
}

echo json_encode($response);
mysqli_close($konek);

