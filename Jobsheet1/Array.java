import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] MK = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        int[] nilaiAngka = new int[MK.length];
        String[] nilaiHuruf = new String[MK.length];
        double[] bobotNilai = new double[MK.length];

        System.out.println("=====================================");
        System.out.println("   Program Menghitung IP Semester");
        System.out.println("=====================================");

        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = in.nextInt();
            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("=====================================");
        System.out.println("          Hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s %-12d %-12s %.2f%n", MK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("=====================================");
        double totalNilai = 0;
        for (int i = 0; i<MK.length; i++){
            totalNilai += bobotNilai[i];
        }
        double IP = totalNilai / MK.length;
        System.out.printf("IP: %.2f%n", IP);
    }
}
