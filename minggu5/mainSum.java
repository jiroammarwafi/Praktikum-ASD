package minggu5;
import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = in.nextInt();

        classSum sm = new classSum(elemen); // deklarasi & instansiasi
        for (int i=0;i<elemen;i++){
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = in.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide n Conquer: "
        +sm.totalDC(sm.keuntungan,0,elemen-1));
        in.close();
    }
}
