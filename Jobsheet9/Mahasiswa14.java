package Jobsheet9;

public class Mahasiswa14 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa14 (String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}