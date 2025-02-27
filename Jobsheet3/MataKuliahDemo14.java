import java.util.Scanner;
public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        MataKuliah14[] arrayOfMataKuliah = new MataKuliah14[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0;i<3;i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+ (i+1));
            System.out.print("Kode       : ");
            kode = in.nextLine();
            System.out.print("Nama       : ");
            nama = in.nextLine();
            System.out.print("SKS        : ");
            dummy = in.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = in.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            arrayOfMataKuliah[i]  = new MataKuliah14(kode, nama, sks, jumlahJam);
        }
        for (int i=0; i<3; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode       : "+ arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : "+ arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : "+ arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : "+ arrayOfMataKuliah[i].jumlahJam); 
            System.out.println("--------------------------------------");
        }
        in.close();
    }
}