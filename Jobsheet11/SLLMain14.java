package Jobsheet11;
import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();
        Scanner sr = new Scanner (System.in);
        
        for (int i=0; i<4; i++) {
            System.out.printf("Input Data Mahasiswa ke-%d%n", i+1);
            System.out.print("Nama: "); String nama = sr.nextLine();
            System.out.print("NIM: "); String nim = sr.nextLine();
            System.out.print("Kelas: "); String kelas = sr.nextLine();
            System.out.print("IP: "); double ipk = sr.nextDouble(); sr.nextLine();
            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk); sll.addLast(mhs);
            System.out.println("[> UPDATE");
            sll.print();
        }
        System.out.println("Program Berakhir");
        sr.close();
    }
}
