package minggu5;
import java.util.Scanner;

public class MainPangkat{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: "); 
        int elemen = in.nextInt();

        classPangkat[] png = new classPangkat[elemen]; // deklarasi & instansiasi ArrayOfObject
        for(int i=0; i<elemen; i++){
            System.out.print("\nMasukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = in.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = in.nextInt();
            png[i] = new classPangkat(basis, pangkat); // instansiasi object
        }
        System.out.println("\nHASIL PANGKAT BRUTEFORCE:");
        for (classPangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "
            +p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("\nHASIL PANGKAT DIVIDE N CONQUER:");
        for (classPangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "
            +p.pangkatDC(p.nilai, p.pangkat));
        }
        in.close();
    }
}