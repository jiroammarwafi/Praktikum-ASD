package Jobsheet11;

public class Mahasiswa14 {
        String nim, nama, kelas;
        double ipk;

        Mahasiswa14(String nm, String name, String kls, double ip) {
            nim = nm;
            nama = name;
            kelas = kls;
            ipk = ip;
        }

        void tampilInformasi () { 
            System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
        } 
}
