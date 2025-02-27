import java.util.Scanner;
public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String dummy;

        // deklarasi array of object
        Mahasiswa14[] arrayOfMahasiswa = new Mahasiswa14 [3];

        for (int i=0; i<3; i++) {
        //  instansiasi array of object
            arrayOfMahasiswa[i] = new Mahasiswa14();
            
        //  inisialisasi atribut dalam object 
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = in.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = in.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = in.nextLine();
            System.out.print("IPK     : ");
            dummy = in.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------");
        }

        for (int i =0; i<3; i++) {
            // cetak atribut
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
        in.close();
    }
}