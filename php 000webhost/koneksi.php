<?php
$host   = "localhost";
$user   = "id17530483_root";
$pass   = "@Renaldi1310";
$db     = "id17530483_arphone";

$konek = mysqli_connect($host, $user, $pass, $db) or die("Data Tidak Terhubung");

if (!$konek){
    die("Koneksi Gagagl ; ".mysqli_connect_error());
}


?>