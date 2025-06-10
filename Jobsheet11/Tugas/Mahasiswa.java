package Jobsheet11.Tugas;

public class Mahasiswa { // Data Mahasiswa
    String nim, nama, jurusan;

        Mahasiswa(String name, String nm, String jrs) {
            nama = name;
            nim = nm;
            jurusan = jrs;
        }

        void tampilInformasi () { 
            System.out.printf("%s\t%s\t%s%n", nama, nim, jurusan);
        } 
}
