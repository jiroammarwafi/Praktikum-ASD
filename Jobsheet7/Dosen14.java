package Jobsheet7;

public class Dosen14 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen14 () {}

    Dosen14 (String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}
