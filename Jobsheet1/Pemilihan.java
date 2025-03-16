import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        byte [] nilai = new byte [4];
        String [] objek = {"Tugas", "Kuis", "UTS", "UAS"};
        double nilaiAkhir = 0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================="); 
        for (int i=0; i<nilai.length;i++){
            System.out.print("Masukkan Nilai " + objek[i] + ": ");
            nilai[i] = in.nextByte();
            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Input tidak valid");
                i--;
                continue;
            } if (i<2){
                nilaiAkhir += (nilai[i] * 0.2);
            } else {
                nilaiAkhir += (nilai[i] * 0.3);
            }
        }
        System.out.println("=============================="); 
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.print("Nilai Huruf: ");
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            System.out.print("A");
        }
        if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.print("B+");
        }
        if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.print("B");
        }
        if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.print("C+");
        }
        if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.print("C");
        }
        if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.print("D");
        }
        if (nilaiAkhir <= 39){
            System.out.print("E");
        }
        System.out.print("\nSTATUS KELULUSAN: ");
        if (nilaiAkhir <= 50) {
            System.out.print("TIDAK LULUS");
        } else {
            System.out.print("LULUS");
        }
    }
}