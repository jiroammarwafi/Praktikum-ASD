public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        setStatusAktif(statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);   
    }

    void setStatusAktif(boolean status) {
        if (status = true) {
            System.out.println("Status Dosen: Aktif");
        } else {
            System.out.println("Status Dosen: Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        return (thnSkrg - tahunBergabung);
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen14 () {
    }

    public Dosen14 (String idDosen, String nama, boolean statusAktif,
     int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

}
