public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sks) {
        this.sks = sks;
        System.out.println("  > SKS telah berhasil diubah");
    }

    void tambahJam (int jumlahJam) {
        this.jumlahJam += jumlahJam;
        System.out.println("  > Jumlah Jam telah ditambahkan");
    }

    void kurangiJam (int jumlahJam) {
        if (this.jumlahJam > jumlahJam) {
            System.out.println("  > Jumlah Jam telah diubah: " + (this.jumlahJam -= jumlahJam));
        } else {
            System.out.println("  > Pengurangan Jumlah Jam tidak dapat dilakukan !");
        }
    }

    public MataKuliah14() {

    }

    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}