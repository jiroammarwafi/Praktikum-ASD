package minggu5;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai: "); int nilai = in.nextInt();
        classFaktorial objFk = new classFaktorial();
        System.out.println("Nilai Faktorial "+nilai+
        " menggunakan BruteForce: "+objFk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial "+nilai+
        " menggunakan Divide n Conquer: "+objFk.faktorialDC(nilai));
        
        in.close();     
    }
}