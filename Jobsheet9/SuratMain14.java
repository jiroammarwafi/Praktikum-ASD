package Jobsheet9;
import java.util.Scanner;
public class SuratMain14 {
    public static void main(String[] args) {
        StackSurat14 surat = new StackSurat14(5);
        Scanner sc = new Scanner (System.in);
        int menu, count = 0;
        boolean cekInput = true;

        while (cekInput) {
            System.out.println("\nMenu:");
            System.out.println("1. Buat Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Mahasiswa");
            System.out.println("5. Exit Program");
            System.out.print("Pilih: "); menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1 : 
                    count++;
                    String idSurat = Integer.toString(count);
                    System.out.print("Nama Mahasiswa: "); String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    char jenisIzin = surat.jenisIzin();
                    System.out.print("Durasi Jam Pelajaran: "); int durasi = sc.nextInt(); sc.nextLine();
                    Surat14 inputSurat = new Surat14(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    surat.push(inputSurat);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", inputSurat.namaMahasiswa);
                break;
                case 2: 
                    Surat14 prosesSurat = surat.pop();
                    if (prosesSurat != null) {
                        System.out.println("Surat atas nama " + prosesSurat.namaMahasiswa + " telah di-approve");
                        System.out.println();
                    }
                break;
                case 3: 
                    Surat14 suratTerakhir = surat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + suratTerakhir.namaMahasiswa);
                    }
                break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa terkait: "); String search = sc.nextLine();
                    surat.cariSurat(search);
                break;
                case 5:
                    System.out.println("Program berakhir");
                    cekInput = false;
                break;
                default:
                    System.out.println("Input gagal");
                break;
            }
        }
        sc.close();
    }
}
