package Jobsheet9;
import java.util.Scanner;
public class MahasiswaDemo14 {
    public static void main(String[] args) {
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Lihat Mahasiswa yang mengumpulkan tugas pertama kali");
            System.out.println("6. Total Mahasiswa yang telah mengumpulkan tugas");
            System.out.print("Pilih: "); pilih = scan.nextInt(); scan.nextLine();

            switch (pilih) {
                case 1 : 
                    System.out.print("Nama: "); String nama = scan.nextLine();
                    System.out.print("NIM: "); String nim = scan.nextLine();
                    System.out.print("Kelas: "); String kelas = scan.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
                case 2 :
                    Mahasiswa14 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): "); int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                break;
                case 3 :
                    Mahasiswa14 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                break;
                case 4 :
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas"); stack.print();
                break;
                case 5 :
                    Mahasiswa14 test1 = stack.reversePeek();
                    if (test1 != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + test1.nama);
                    }
                break;
                case 6:
                    stack.totalPengumpulanSaatIni();
                break;
                default :
                    System.out.println("Pilihan tidak valid.");
                break;
            }
        } while (pilih >=1 && pilih <= 6);

        scan.close();
    }
}
