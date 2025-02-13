import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan NIM: ");
        long nim = in.nextLong();

        int n = (int) (nim % 100);
        if (n<10) {
            n += 10;
        }

        System.out.println("=============================="); 
        System.out.println("N: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}