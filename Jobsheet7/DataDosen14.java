package Jobsheet7;

public class DataDosen14 {
    Dosen14[] dataDosen14 = new Dosen14[2];
    int idx;
    int multi[] = new int[2];

    DataDosen14 (int index){
        dataDosen14 = new Dosen14[index];
        multi = new int[index];
    }

    void tambah(Dosen14 arrayDosen) {
        if (idx<dataDosen14.length) {
            dataDosen14[idx]=arrayDosen;
            idx++;
        } else {
            System.out.println("Data Penuh !");
        }
    }

    void tampil() {
        if (dataDosen14[1] != null) {
            for (Dosen14 dosen : dataDosen14) {
                dosen.tampil();
                System.out.println("-----------------------");
            } 
        } else {
                System.out.println("NULL.");
        }
    }

    void SortingASC() { // BubbleSort Ascending
        if (dataDosen14[1] != null) {
            for (int i=0; i<dataDosen14.length-1; i++){
                for (int j=1; j<dataDosen14.length-i;j++){
                    if (dataDosen14[j].usia<dataDosen14[j-1].usia){
                        Dosen14 tmp = dataDosen14[j];
                        dataDosen14[j] = dataDosen14[j-1];
                        dataDosen14[j-1] = tmp;
                    }
                }
            }
        } else {
            System.out.println("NULL.");
        }
    }

    void SortingDSC() { // SelectionSort Descending

        if (dataDosen14[1] != null) {
            for (int i=0; i<dataDosen14.length-1;i++){
                int idxMax=i;
                for (int j=i+1; j<dataDosen14.length;j++) {
                    if (dataDosen14[j].usia>dataDosen14[idxMax].usia){
                        idxMax = j;
                    }
                }
                Dosen14 tmp = dataDosen14[idxMax];
                dataDosen14[idxMax]=dataDosen14[i];
                dataDosen14[i] = tmp;
            }
        } else {
            System.out.println("NULL.");
        }
        
    }

    void hasilPencarian (byte jumlahPencarian, int posisi) {
        System.out.println("Hasil Pencarian: "+jumlahPencarian);
        if (jumlahPencarian > 1) {
            System.out.println("Terdapat lebih dari 1 hasil yang ditemukan !");
            System.out.println("\nData Pencarian");
            System.out.println("--------------");
            for (int i = 0; i<dataDosen14.length; i++) {
                if (i == multi[i]) {
                    System.out.println("Nama Dosen: " + dataDosen14[i].nama);
                    System.out.println("Kode: " + dataDosen14[i].kode);
                    System.out.println("Jenis Kelamin: " + (dataDosen14[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
                    System.out.println("Usia: " + dataDosen14[i].usia);
                }
            }
        } else if (jumlahPencarian == 1){
            System.out.println("\nData Pencarian");
            System.out.println("--------------");
            System.out.println("Nama Dosen: " + dataDosen14[posisi].nama);
            System.out.println("Kode: " + dataDosen14[posisi].kode);
            System.out.println("Jenis Kelamin: " + (dataDosen14[posisi].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + dataDosen14[posisi].usia);
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    int PencarianDataSequential14(String namaDosen){
        int posisi = -1;
        byte hasilPencarian = 0;
        for (int j=0; j<dataDosen14.length; j++){
            if (dataDosen14[j].nama.equalsIgnoreCase(namaDosen)){
                posisi = j;
                multi[j] = posisi;
                hasilPencarian += 1 ;
            }
        }
        hasilPencarian(hasilPencarian, posisi);
        return posisi;
    }

    void PencarianDataBinary14(int usiaDosen, int left, int right) {
        int mid = 0;
        int posisi;
        byte hasilPencarian1 = 0;

        if (right>=left){
            mid = (left+right)/2; // Divide
            if (usiaDosen == dataDosen14[mid].usia){
                posisi = mid;
                multi[mid] = posisi;
                hasilPencarian1 += 1;
            } else if (dataDosen14[mid].usia < usiaDosen){
                PencarianDataBinary14(usiaDosen, left, mid-1); // Conquer
            } else {
                PencarianDataBinary14(usiaDosen, mid+1, right); // Conquer
            }
        }
        hasilPencarian(hasilPencarian1, mid);
    }
}
