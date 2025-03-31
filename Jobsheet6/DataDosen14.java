package Jobsheet6;

public class DataDosen14 {
    Dosen14[] dataDosen14 = new Dosen14[2];
    int idx;

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

}
