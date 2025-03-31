package Jobsheet6;
import java.util.Scanner;
public class DosenMain14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataDosen14 dosen = new DataDosen14();
        byte bykData = 10;
        boolean jenisKelamin=true;

        while (bykData==10) {
            System.out.println("\n>>> Pilihan Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting Ascending - Bubble Sort");
            System.out.println("4. Sorting Descending - Selection Sort");
            System.out.println("5. END");
            System.out.print("Pilih: "); byte pilihan = in.nextByte(); in.nextLine();

            switch (pilihan){
                case 1: 
                    System.out.println("\n>>> Tambah Data");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Masukkan data dosen ke-" + (i + 1));
                        System.out.print("Kode: ");
                        String kode = in.nextLine();
                        System.out.print("Nama: ");
                        String nama = in.nextLine();
                        
                        byte x = 1;
                            while (x!=0) {
                                System.out.print("Jenis kelamin (L/P): ");
                                String inputJK = in.nextLine().toLowerCase();
                                if (inputJK.equals("l")) {
                                    jenisKelamin = true;
                                    x = 0;
                                } else if (inputJK.equals("p")) {
                                    jenisKelamin = false;
                                    x = 0;
                                } else {
                                    System.out.println("input salah");
                                    x = 1;
                            }
                        }
                        System.out.print("Usia: ");
                        int usia = in.nextInt();
                        in.nextLine(); 
                        System.out.println("----------------------");
                        
                        dosen.tambah(new Dosen14(kode, nama, jenisKelamin, usia));
                    }
                 break;
                case 2:
                    System.out.println("\n>>> Tampilkan Data");
                    dosen.tampil();
                break;
                case 3:
                    System.out.println("\n>>> Sorting Ascending - Bubble Sort");
                    dosen.SortingASC();
                    dosen.tampil();
                break;
                case 4:
                    System.out.println("\n>>> Sorting Descending - Selection Sort");
                    dosen.SortingDSC();
                    dosen.tampil();
                break;
                case 5:
                    System.out.println("\n>>> END PROGRAM");
                    bykData = 0;
                break;
                default:
                    System.out.println("Input tidak valid");
                break;
            } 
        }

        in.close();
    }
}
