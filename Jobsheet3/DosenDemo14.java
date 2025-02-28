import java.util.Scanner;
public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Dosen14[] arrayOfDosen = new Dosen14[1];
        String kode, nama, dummy;
        boolean jenisKelamin=true;
        int usia;
        
        for (int i=0;i<arrayOfDosen.length;i++){
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode          : "); kode = in.nextLine();
            System.out.print("Nama          : "); nama = in.nextLine();
            
            int j = 1;
            while (j != 0){
                System.out.print("Jenis Kelamin : "); dummy = in.nextLine().toLowerCase();
                if (dummy.charAt(0) == 'p') {
                    jenisKelamin = Boolean.parseBoolean(dummy);
                    jenisKelamin = true;
                    j = 0;
                } else if (dummy.charAt(0) == 'w') {
                    jenisKelamin = Boolean.parseBoolean(dummy);
                    jenisKelamin = false;
                    j = 0;
                } else {
                    System.out.println("input tidak terdeteksi");
                }
            }
            System.out.print("Usia          : ");
            usia = in.nextInt();
            in.nextLine();
            System.out.println("--------------------------------------\n");


            arrayOfDosen[i] = new Dosen14(kode,nama,jenisKelamin, usia);
        }

        int i=0;
        for (Dosen14 array : arrayOfDosen){
            System.out.println("Data Dosen ke-"+(i+1));
            System.out.println("Kode          : "+array.kode);
            System.out.println("Nama          : "+array.nama);
            System.out.println("Jenis Kelamin : "+(array.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : "+array.usia);
            System.out.println("--------------------------------------\n");
        }

        in.close();
    }
}