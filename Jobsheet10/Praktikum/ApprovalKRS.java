package Jobsheet10.Praktikum;
import java.util.Scanner;

public class ApprovalKRS {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            QueueKRS antrian = new QueueKRS();
            int pilihan, count;
    
            do {
                System.out.println("\n=== Menu Antrian KRS ===");
                System.out.println("1. Tambah Permohonan KRS");
                System.out.println("2. Proses KRS");
                System.out.println("3. Cek antrian paling depan");
                System.out.println("4. Lihat semua antrian");
                System.out.println("5. Cek Antrian paling belakang");
                System.out.println("6. Jumlah Antrian saat ini");
                System.out.println("7. Jumlah KRS yang telah diproses");
                System.out.println("8. Jumlah Mahasiswa yang belum melakukan proses KRS");
                System.out.println("0. Keluar");
                System.out.print("Pilih Menu: "); pilihan = sc.nextInt(); sc.nextLine();
                count = 0;

                switch (pilihan) {
                    case 1:
                        System.out.print("NIM: "); String nim = sc.nextLine();
                        System.out.print("Nama: "); String nama = sc.nextLine();
                        System.out.print("Prodi: "); String prodi = sc.nextLine();
                        System.out.print("Kelas: "); String kelas = sc.nextLine();
    
                        InfoKRS krs = new InfoKRS(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(krs); count++;
                        break;
                    case 2:
                            System.out.println("Melayani mahasiswa: ");
                            do {
                                InfoKRS dilayani = antrian.layaniKRS();
                                if (dilayani != null) {
                                    dilayani.tampilkanData();
                                    count++;
                                } else {
                                    System.out.println("Antrian ke "+ (count+1) +" kosong.");
                                    break;
                                }
                            } while (count < 2);
                        break;
                    case 3:
                        antrian.lihatTerdepan();
                        break;
                    case 4:
                        antrian.tampilkanSemua();
                        break;
                    case 5:
                        antrian.LihatAkhir();
                        break;
                    case 6:
                        System.out.println("Jumlah KRS dalam antrian: " + antrian.getJumlahAntrian());
                        break;
                    case 7:
                        System.out.println("KRS telah diproses sebanyak: " + antrian.ApprovedCount() +" kali.");    
                        break;
                    case 8:
                        System.out.println("Mahasiswa yang belum memproses KRS sebanyak: " + (30 - (antrian.ApprovedCount())));
                        break;
                    case 0:
                        System.out.println("Terima kasih.");
                        break;                
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 0 && !antrian.LimitApproval());
            System.out.println("Seluruh KRS telah diproses, Terima Kasih !");
            
            sc.close();
        }
    }