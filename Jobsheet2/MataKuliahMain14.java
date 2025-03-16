import java.util.Scanner;
public class MataKuliahMain14 {
    public static void main(String[] args) {
        boolean status = true;
        Scanner IN = new Scanner (System.in);

        MataKuliah14 MK1 = new MataKuliah14();
        MK1.kodeMK = "ASD";
        MK1.nama = "Algoritma dan Struktur Data";
        MK1.sks = 16;
        MK1.jumlahJam = 4;

        MataKuliah14 MK2 = new MataKuliah14("PASD", 
        "Praktikum Algoritma dan Struktur Data", 18, 8 );

        while (status) {
            System.out.println("\nPilih Konstruktor");
            System.out.println("1. Default");
            System.out.println("2. dengan Parameter");
            System.out.println("3. Selesai");
            System.out.print("||| Pilih: ");
            byte pilih = IN.nextByte();
            System.out.println();

        switch (pilih) {
            case 1:
                MK1.tampilInformasi();
                System.out.println("    Menu");
                System.out.println("    1. Mengubah SKS");
                System.out.println("    2. Tambah Jam");
                System.out.println("    3. Kurangi Jam");
                System.out.print("    ||| Pilih: ");
                pilih = IN.nextByte();
                int jumlahJam = 0;

                    switch (pilih) {
                        case 1:
                            System.out.print("    SKS yang baru: ");
                            int sks = IN.nextInt();
                            MK1.ubahSKS(sks);
                        break;
                        case 2:
                            System.out.print("    Jumlah jam yang akan ditambahkan: ");
                            jumlahJam = IN.nextInt();
                            MK1.tambahJam(jumlahJam);;
                        break;
                        case 3:
                            System.out.print("    Pengurangan jam: ");
                            jumlahJam = IN.nextInt();
                            MK1.kurangiJam(jumlahJam);
                        break;
                        default:
                            System.out.println("  > Input Salah");
                        continue;
                    }
            break;
            case 2:
                MK2.tampilInformasi();
                System.out.println("    Menu");
                System.out.println("    1. Mengubah SKS");
                System.out.println("    2. Tambah Jam");
                System.out.println("    3. Kurangi Jam");
                System.out.print("    ||| Pilih: ");
                pilih = IN.nextByte();

                switch (pilih) {
                    case 1:
                        System.out.print("    SKS yang baru: ");
                        int sks = IN.nextInt();
                        MK2.ubahSKS(sks);
                    break;
                    case 2:
                        System.out.print("    Jumlah jam yang akan ditambahkan: ");
                        jumlahJam = IN.nextInt();
                        MK2.tambahJam(jumlahJam);;
                    break;
                    case 3:
                        System.out.print("    Pengurangan jam: ");
                        jumlahJam = IN.nextInt();
                        MK2.kurangiJam(jumlahJam);
                    break;
                    default:
                        System.out.println("  > Input Salah");
                    continue;
                }
            break;
            case 3:
                status = false;
                System.out.println("> END");
            break;
            default:
                System.out.println("> Input salah");
            break;
        }
        }

        
        IN.close();
    }   
}