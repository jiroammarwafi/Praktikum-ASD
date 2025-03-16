public class Kuis14 {
    public String nim14;
    public String nama14;
    public double nilaiKuis14;
    public double nilaiUTS14;
    public double nilaiUAS14;


    void tampilkanInformasi() {
        System.out.println("NIM: " + nim14);
        System.out.println("Nama: " + nama14);
        System.out.println("Nilai Kuis: " + nilaiKuis14);
        System.out.println("Nilai UTS: " + nilaiUTS14);
        System.out.println("Nilai UAS: " + nilaiUAS14);
    }

    double hitungNilaiAkhir() {
        double nilaiAkhir14 = (0.2*nilaiKuis14) + (0.35*nilaiUTS14) + (0.45*nilaiUAS14);
        return nilaiAkhir14;
    }
    public Kuis14 (String nim14, String nama14, double nilaiKuis14, double nilaiUTS14, double nilaiUAS14) {
        this.nim14 = nim14;
        this.nama14 = nama14;
        this.nilaiKuis14 = nilaiKuis14;
        this.nilaiUTS14 = nilaiUTS14;
        this.nilaiUAS14 = nilaiUAS14;
    }
}