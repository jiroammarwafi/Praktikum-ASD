import java.util.Scanner;

public class Fungsi {
    static void stok1(byte flower[][]) {
        System.out.printf("\n%-15s %12s %8s %10s %8s %n", 
                          "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.println("----------------------------------------------------------");

        for (int x = 0; x < 4; x++) {
            System.out.printf("%-15s", "RoyalGarden " + (x + 1)); 
            for (int y = 0; y < 4; y++) {
                System.out.printf("%10d", flower[x][y]);
            }
            System.out.println();
        }
    }

    static void stok2(byte flower[][]) {
        int[] harga = {75000, 50000, 60000, 10000}; 

        System.out.printf("\n%-15s %10s %8s %10s %8s %15s %n", 
                          "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar", "     Pendapatan");
        System.out.println("-------------------------------------------------------------------------");

        for (int x = 0; x < 4; x++) {
            int totalPendapatan = 0;
            System.out.printf("%-15s", "RoyalGarden " + (x + 1));
            for (int y = 0; y < 4; y++) {
                int pendapatan = flower[x][y] * harga[y];
                totalPendapatan += pendapatan;
                System.out.printf("%10d", pendapatan);
            }
            System.out.printf("%15d%n", totalPendapatan);
        }
    }

    static void stok3(byte flower[][]) {
        int[] perubahan = {-1, -2, 0, -5};

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                flower[x][y] += perubahan[y];
                if (flower[x][y] < 0) {
                    flower[x][y] = 0;
                }
            }
        }

        System.out.println("\nStok setelah pengurangan:");
        stok1(flower);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        while (true) {
            System.out.println("\nPILIHAN MENU");
            System.out.println("1. Stok hari ini");
            System.out.println("2. Pendapatan per cabang");
            System.out.println("3. Jumlah Stok di cabang 4 setelah pengurangan stok");
            System.out.print("Pilih: ");
            byte pilihan = in.nextByte();

            switch (pilihan) {
                case 1:
                    stok1(bunga);
                    break;
                case 2:
                    stok2(bunga);
                    break;
                case 3:
                    stok3(bunga);
                    break;
                default:
                    System.out.println("!!! Input salah !!!");
            }
        }
    }
}
