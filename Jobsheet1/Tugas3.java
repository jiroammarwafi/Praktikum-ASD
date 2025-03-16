import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N untuk mewakili banyak data: ");
        int N = in.nextInt();
        in.nextLine();

        String[] namaMK = new String[N];
        int[] SKS = new int[N];
        int[] Semester = new int[N];
        String[] hariK = new String[N];

        for (int x = 0; x < N; x++) {
            System.out.println("\n===============================");
            System.out.print("Mata Kuliah: ");
            namaMK[x] = in.nextLine();
            System.out.print("Banyaknya SKS: ");
            SKS[x] = in.nextInt();
            System.out.print("Semester: ");
            Semester[x] = in.nextInt();
            in.nextLine();
            System.out.print("Hari Kuliah (Senin - Jumat): ");
            hariK[x] = in.nextLine();
        }

        while (true) {
            System.out.println("\nPILIHAN MENU");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan semester tertentu");
            System.out.println("4. Pencarian mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("||| PILIH MENU: ");
            int pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK, SKS, Semester, hariK, N);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan: ");
                    String hariCari = in.nextLine();
                    tampilkanJadwalHari(namaMK, SKS, Semester, hariK, N, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterCari = in.nextInt();
                    tampilkanJadwalSemester(namaMK, SKS, Semester, hariK, N, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String mkCari = in.nextLine();
                    cariMataKuliah(namaMK, SKS, Semester, hariK, N, mkCari);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tampilkanSeluruhJadwal(String[] namaMK, int[] SKS, int[] Semester, String[] hariK, int N) {
        System.out.println("\n===== SELURUH JADWAL KULIAH =====");
        for (int i = 0; i < N; i++) {
            System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Semester: " + Semester[i] + " | Hari: " + hariK[i]);
        }
    }

    static void tampilkanJadwalHari(String[] namaMK, int[] SKS, int[] Semester, String[] hariK, int N, String hariCari) {
        System.out.println("\n===== JADWAL HARI " + hariCari.toUpperCase() + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < N; i++) {
            if (hariK[i].equalsIgnoreCase(hariCari)) {
                System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Semester: " + Semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari);
        }
    }

    static void tampilkanJadwalSemester(String[] namaMK, int[] SKS, int[] Semester, String[] hariK, int N, int semesterCari) {
        System.out.println("\n===== JADWAL SEMESTER " + semesterCari + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < N; i++) {
            if (Semester[i] == semesterCari) {
                System.out.println(namaMK[i] + " | SKS: " + SKS[i] + " | Hari: " + hariK[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + semesterCari);
        }
    }

    static void cariMataKuliah(String[] namaMK, int[] SKS, int[] Semester, String[] hariK, int N, String mkCari) {
        boolean ditemukan = false;
        for (int i = 0; i < N; i++) {
            if (namaMK[i].equalsIgnoreCase(mkCari)) {
                System.out.println("\n===== DETAIL MATA KULIAH =====");
                System.out.println("Mata Kuliah: " + namaMK[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + Semester[i]);
                System.out.println("Hari: " + hariK[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + mkCari + " tidak ditemukan.");
        }
    }
}
