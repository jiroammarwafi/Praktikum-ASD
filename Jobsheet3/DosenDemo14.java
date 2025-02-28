import java.util.Scanner;
public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        DataDosen14[] arrayOfDosen = new DataDosen14[3];
        String dummy;
        
        for (int i=0;i<arrayOfDosen.length;i++){
            arrayOfDosen[i] = new DataDosen14();
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode          : "); arrayOfDosen[i].kode = in.nextLine();
            System.out.print("Nama          : "); arrayOfDosen[i].nama = in.nextLine();
            
            int j = 1;
            while (j != 0){
                System.out.print("Jenis Kelamin : "); dummy = in.nextLine().toLowerCase();
                if (dummy.charAt(0) == 'p') {
                    arrayOfDosen[i].jenisKelamin = true;
                    j = 0;
                } else if (dummy.charAt(0) == 'w') {
                    arrayOfDosen[i].jenisKelamin = false;
                    j = 0;
                } else {
                    System.out.println("input tidak terdeteksi");
                }
            }
            System.out.print("Usia          : ");
            arrayOfDosen[i].usia = in.nextInt();
            in.nextLine();
            System.out.println("--------------------------------------\n");
        }

        int i=1;
        for (DataDosen14 array : arrayOfDosen){
            System.out.println("Data Dosen ke-"+(i++));
            array.dataSemuaDosen();
        }

        DataDosen14 infoDosen = new DataDosen14();
        infoDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        infoDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        infoDosen.infoDosenPalingTua(arrayOfDosen);
        infoDosen.infoDosenPalingMuda(arrayOfDosen);
        in.close();
    }
}