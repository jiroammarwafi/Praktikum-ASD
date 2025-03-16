import java.util.Scanner;
public class Tugas2 {
    static Scanner in = new Scanner (System.in);

    static void volKubus(){
        System.out.print("\nMasukkan sisi: ");
        byte sisi = in.nextByte();
        System.out.println("Rumus Volume Kubus = S x S x S");
        System.out.println("Volume = " + (sisi*sisi*sisi) + "\n");
    }

    static void luasPerKubus(){
        System.out.print("\nMasukkan sisi: ");
        byte sisi = in.nextByte();
        System.out.println("Rumus Luas Permukaan Kubus = 6 x S x S");
        System.out.println("Luas Permukaan Kubus = " + (6*sisi*sisi) + "\n");
    }
    static void kelilingKubus(){
        System.out.print("\nMasukkan sisi: ");
        byte sisi = in.nextByte();
        System.out.println("Rumus Keliling Kubus = 12 x S");
        System.out.println("Keliling Kubus = " + (12*sisi) + "\n");
    }

    public static void main(String[] args) {
        boolean status = true;

        while (status) {
            System.out.println("PILIHAN MENU");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Program Berhenti");
            System.out.print("||| PILIH MENU: ");
            byte pilihan = in.nextByte();
    
            switch (pilihan) {
                case 1:
                    volKubus();
                    break;
                case 2:
                    luasPerKubus();
                    break;
                case 3:
                    kelilingKubus();
                    break;
                case 4:
                    status = false;
                    System.out.println("\nPROGRAM BERHENTI\n");
                    break;
                default:
                    System.out.println("\nMenu tidak tersedia\n");
                    break;
            }
        }
        
    }
}