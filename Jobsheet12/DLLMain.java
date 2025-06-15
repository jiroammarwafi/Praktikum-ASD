package Jobsheet12;
import java.util.Scanner;

public class DLLMain {

    public static Mahasiswa14 inputMahasiswa(Scanner scan){
        System.out.println("-- Mengisi Data --");
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble(); scan.nextLine();
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner scan = new Scanner (System.in);
        int pilihan;

        do {
           System.out.println("\nMenu Double Linked List Mahasiswa");
           System.out.println("1. Tambah di awal");
           System.out.println("2. Tambah di akhir");
           System.out.println("3. Hapus di awal");
           System.out.println("4. Hapus di akhir");
           System.out.println("5. Tampilkan data");
           System.out.println("6. Cari Mahasiswa berdasarkan NIM");
           System.out.println("7. Masukkan data setelah urutan node tertentu");
           System.out.println("8. Tambahkan node berdasarkan index");
           System.out.println("9. Hapus node setelah key");
           System.out.println("10. Hapus node berdasarkan index");
           System.out.println("11. Tampilkan data paling depan");
           System.out.println("12. Tampilkan data paling belakang");
           System.out.println("13. Tampilkan data berdasarkan index");
           System.out.println("14. Cek Jumlah Data saat ini");
           System.out.println("0. Keluar");
           System.out.print("Pilih Menu: "); pilihan = scan.nextInt(); scan.nextLine();

           switch (pilihan) {
            case 1 -> {
                Mahasiswa14 mhs = inputMahasiswa(scan);
                list.addFirst(mhs);
            }
            case 2 -> {
                Mahasiswa14 mhs = inputMahasiswa(scan);
                list.addLast(mhs);
            }
            case 3 -> list.removeFirst();
            case 4 -> list.removeLast();
            case 5 -> list.print();
            case 6 -> {
                System.out.print("Masukkan NIM yang dicari: ");
                String nim = scan.nextLine();
                Node14 found = list.search(nim);
                if (found != null) {
                    System.out.println("Data ditemukan");
                    found.data.tampil();
                } else {
                    System.out.println("Data tidak ditemukan");
                }
            }
            // Modifikasi 2
            case 7 -> {
                Mahasiswa14 mhs = inputMahasiswa(scan);
                System.out.print("Masukkan NIM sebagai kata kunci: "); String nimSearch = scan.nextLine();
                list.insertAfter(nimSearch, mhs);
            }
            case 8 -> {
                Mahasiswa14 mhs = inputMahasiswa(scan);
                System.out.print("Masukkan index: "); int index = scan.nextInt(); scan.nextLine();
                list.addByIndex(index, mhs);
            }
            case 9 -> {
                System.out.print("Masukkan NIM: "); String key = scan.nextLine();
                list.removeAfter(key);
            }
            case 10 -> {
                System.out.print("Masukkan index: "); int index = scan.nextInt();
                list.removeByIndex(index);
            }
            case 11 -> {
                System.out.println("Data pada urutan paling depan: "); list.getFirst();
            }
            case 12 -> {
                System.out.println("Data pada urutan paling terakhir: "); list.getLast();
            }
            case 13 -> {
                System.out.print("Masukkan Index: "); int cari = scan.nextInt(); scan.nextLine();
                list.getIndex(cari);
            }
            case 14 -> list.getSize();
            case 0 -> System.out.println("Keluar dari program.");
            default -> System.out.println("Pilihan tidak valid!");
           }
        } while (pilihan != 0);
        scan.close();
    }
}
