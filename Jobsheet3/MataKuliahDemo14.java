import java.util.Scanner;
public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen yang diinginkan: ");
        byte ele = in.nextByte();
        in.nextLine();
        MataKuliah14[] arrayOfMataKuliah = new MataKuliah14[ele];

        for (int i=0;i<ele;i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+ (i+1));
            arrayOfMataKuliah[i]  = new MataKuliah14();
            arrayOfMataKuliah[i].tambahData(in);
        }
        for (int i=0; i<ele; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
        }
        in.close();
    }
}