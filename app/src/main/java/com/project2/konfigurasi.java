package com.project2;

public class konfigurasi {

    //ini adalah tujuan request
    public static final String URL_ADD="https://projectpoltekpos.000webhostapp.com/android/tambah.php";
    public static final String URL_DEL = "https://projectpoltekpos.000webhostapp.com/android/tambah2.php";
    public static final String URL_GET_ALL = "https://projectpoltekpos.000webhostapp.com/android/tampilSemua.php";
    public static final String URL_GET_EMP = "https://projectpoltekpos.000webhostapp.com/android/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "https://projectpoltekpos.000webhostapp.com/android/updatePgw.php";
    public static final String URL_DELETE_EMP = "https://projectpoltekpos.000webhostapp.com/android/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    //ini adalah nama kolom yang harus disesuaikan dengan database
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NOMOR = "nomor";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_JENIS = "jenis"; //desg itu variabel untuk posisi

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JENIS = "jenis";

    //ID
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
