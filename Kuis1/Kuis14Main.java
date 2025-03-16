public class Kuis14Main {
    public static void main(String[] args) {
        Kuis14[] arrayKuis14 = new Kuis14[4];

        arrayKuis14[0] = new Kuis14("2411", "Endra", 73.4, 88.4, 82.9);
        arrayKuis14[1] = new Kuis14("2468", "Lely", 80.1, 85.9, 79.6);
        arrayKuis14[2] = new Kuis14("2473", "Yuni", 91.2, 90.3, 85.3);
        arrayKuis14[3] = new Kuis14("2479", "Roma", 88.5, 88.4, 80.2);
        
        for (int i=0; i<arrayKuis14.length; i++) {
            System.out.println("Data Mahasiswa " + (i+1)+ ": ");
            arrayKuis14[i].tampilkanInformasi();
            System.out.println("=================");
        }
        for (int i=0; i<arrayKuis14.length; i++) {
            System.out.print("Nilai Akhir Mahasiswa ("+arrayKuis14[i].nama14+") adalah: ");
            System.out.printf("%.1f%n", arrayKuis14[i].hitungNilaiAkhir());
        }
    }
}