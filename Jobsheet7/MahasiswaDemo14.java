package Jobsheet7;
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = in.nextInt(); in.nextLine();
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jumMhs);
    
        System.out.println(">>> START INPUT");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.print("NIM: ");
            String nim = in.nextLine();

            System.out.print("Nama: ");
            String nama= in.nextLine();

            System.out.print("Kelas: ");
            String kelas = in.nextLine();

            System.out.print("IPK: ");
            String ip = in.nextLine();
            Double ipk = Double.parseDouble(ip);

            System.out.println("--------------------------------");

            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }
        System.out.println(">>> END INPUT");
       
        System.out.println("\n>>> Data mahasiswa yang telah di input: ");
        list.tampil();
    
        System.out.println("--------------------------------------");
        System.out.println("Data Searching");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        System.out.print("IPK: "); double cari = in.nextDouble();

        // // Searching data secara Sequential
        System.out.println("Searching secara Sequential");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("--------------------------------------");

        // Searching data secara Binary
        System.out.println("Searching secara Binary");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        in.close();
    }
}