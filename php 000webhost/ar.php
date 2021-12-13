<?php
require("koneksi.php");
$id_spesifikasi = $_GET['id_spesifikasi'];
$perintah = "SELECT * FROM augmented_reality where id_spesifikasi = $id_spesifikasi";
$eksekusi = mysqli_query($konek, $perintah);
$cek = mysqli_affected_rows($konek);

if($cek > 0){
    $response["pesan"] = "Data Tampil";
    $response["dataar"] = array();
    
        while($ambil = mysqli_fetch_object($eksekusi)){
        $D["id"] = $ambil -> id;    
        $D["id_spesifikasi"] = $ambil-> id_spesifikasi;
        $D["nama_type"] = $ambil-> nama_type;
        $D["file"] = $ambil -> file;
        
        array_push($response["dataar"], $D);
    
        // $response["dataar"] = $D;
        }
}else{
    $response["pesan"] = "Data Tidak Tampil";
}

echo json_encode($response);
mysqli_close($konek);