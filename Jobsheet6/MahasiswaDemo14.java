package Jobsheet6;
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        byte bykData = 5;
        String[] nim = new String[bykData];
        String[] nama = new String[bykData];
        String[] kelas = new String[bykData];
        double[] ipk = new double[bykData];

        System.out.println(">>> START INPUT");
        for (int i = 0; i < bykData; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.print("NIM: ");
            nim[i] = in.nextLine();

            System.out.print("Nama: ");
            nama[i]= in.nextLine();

            System.out.print("Kelas: ");
            kelas[i]= in.nextLine();

            System.out.print("IPK: ");
            ipk[i]= in.nextDouble();
            in.nextLine();
        }
        System.out.println(">>> END INPUT");
        Mahasiswa14 m1 = new Mahasiswa14(nim[0], nama[0], kelas[0], ipk[0]); list.tambah(m1);
        Mahasiswa14 m2 = new Mahasiswa14(nim[1], nama[1], kelas[1], ipk[1]); list.tambah(m2);
        Mahasiswa14 m3 = new Mahasiswa14(nim[2], nama[2], kelas[2], ipk[2]); list.tambah(m3);
        Mahasiswa14 m4 = new Mahasiswa14(nim[3], nama[3], kelas[3], ipk[3]); list.tambah(m4);
        Mahasiswa14 m5 = new Mahasiswa14(nim[4], nama[4], kelas[4], ipk[4]); list.tambah(m5);

        System.out.println("\n>>> Data mahasiswa sebelum sorting: ");
        list.tampil();
    
        System.out.println("\n>>> Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\n>>> Sorting Ascending dengan SELECTION SORT");
        list.SelectionSort();
        list.tampil();

        in.close();
    }
    
}
