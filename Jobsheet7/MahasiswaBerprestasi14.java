package Jobsheet7;
public class MahasiswaBerprestasi14 {
    Mahasiswa14 [] listMhs; // deklarasi
    int idx;

    MahasiswaBerprestasi14 (int index){
        listMhs = new Mahasiswa14[index]; // inisiasi + inisialisasi
    }
    
    void tambah(Mahasiswa14 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa14 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i;j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i=0; i<listMhs.length-1;i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length;j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa14 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void InsertionSort() {
        for (int i=1; i<listMhs.length; i++) {
            Mahasiswa14 temp = listMhs[i];
            int j = i;
                while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                    listMhs[j]=listMhs[j-1];
                    j--;
                }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("Data Mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : "+listMhs[pos].nim);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Kelas\t : "+listMhs[pos].kelas);
            System.out.println("IPK\t : "+ x);
        } else {
            System.out.println("Data Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid = (left+right)/2; // Divide
            if (cari == listMhs[mid].ipk){
                return (mid);
            } else if (listMhs[mid].ipk < cari){
                return findBinarySearch(cari, left, mid-1); // Conquer
            } else {
                return findBinarySearch(cari, mid+1, right); // Conquer
            }
        } return -1;
    }
}