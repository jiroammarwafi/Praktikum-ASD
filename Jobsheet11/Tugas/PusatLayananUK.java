package Jobsheet11.Tugas;
import java.util.Scanner;
// Main
public class PusatLayananUK { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AntrianLayananUK Antrian = new AntrianLayananUK();
        boolean status = true;

        do {
        System.out.println("\n[ > Layanan Unit Kemahasiswaan");
        System.out.println("Pilih Menu");
        System.out.println("1. Ikut Mengantri");
        System.out.println("2. Cek Status Antrian");
        System.out.println("3. Kosongkan Antrian");
        System.out.println("4. Panggil Antrian");
        System.out.println("5. Tampilkan Antrian");
        System.out.println("6. Akhiri Program");
        System.out.print("Menu: "); int pilih = sc.nextInt(); sc.nextLine(); 
        switch (pilih) {
            case 1:
                if (!Antrian.isFull()) {
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Jurusan: "); String jurusan = sc.nextLine();
                    Mahasiswa Mhs = new Mahasiswa(nama, nim, jurusan);
                    Antrian.addLast(Mhs);
                } else {
                    System.out.println(">> Antrian telah penuh. Tak dapat menambahkan lagi.");
                }
            break;
            case 2:
                Antrian.statusAntrian();
            break;
            case 3:
                Antrian.clear();
            break;
            case 4:
                Antrian.removeFirst();
            break;
            case 5:
                Antrian.cekAntrian();
            break;
            case 6: 
                System.out.println(">> PROGRAM ENDED");
                status = false;
            break;
            default:
                System.out.println("Pilihan tak valid.");
            break;
        }
        } while (status);
    }
}
