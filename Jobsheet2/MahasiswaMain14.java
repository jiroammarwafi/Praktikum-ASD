public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "224107020190";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.99);
        System.out.println();
        mhs1.tampilkanInformasi();
        System.out.println();

        Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila",
        "24410202013", 3.25 ,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}