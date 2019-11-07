<?php
 /*
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/

 Nama Database yang telah dibuat bernama "db_android" 
 Jika database yang kalian buat tidak sama dengan yang dibuat oleh penulis maka ganti nama database 
 sesuai dengan nama database yang kalian buat
 */
 
 //Mendefinisikan Konstanta
 define('HOST','localhost');
 define('USER','id11502449_nabilajkt48lovers');
 define('PASS','Hcmokhbuapep123');
 define('DB','id11502449_db_project2');
 
 //membuat koneksi dengan database
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');
 ?>