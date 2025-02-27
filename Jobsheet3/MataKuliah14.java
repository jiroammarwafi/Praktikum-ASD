import java.util.Scanner;
public class MataKuliah14 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    public Scanner in;

    public MataKuliah14 () {
        
    }

    public void tambahData(Scanner in) {
        System.out.print("Kode       : ");
        this.kode = in.nextLine();
        System.out.print("Nama       : ");
        this.nama = in.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(in.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(in.nextLine());
        System.out.println("--------------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("--------------------------------------");
    }
}