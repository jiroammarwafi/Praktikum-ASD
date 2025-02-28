public class DataDosen14 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    void dataSemuaDosen() {
        System.out.println("Kode          : "+this.kode);
        System.out.println("Nama          : "+this.nama);
        System.out.println("Jenis Kelamin : "+(this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : "+this.usia);
        System.out.println("--------------------------------------\n");
    }

    void jumlahDosenPerJenisKelamin(DataDosen14[] arrayOfDosen) {
        byte pria=0, wanita=0;
        for (DataDosen14 infoDosen : arrayOfDosen){
            if (infoDosen.jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria    : "+pria);
        System.out.println("Jumlah Dosen Wanita  : "+wanita);
        System.out.println("--------------------------------------\n");
    }

    void rerataUsiaDosenPerJenisKelamin(DataDosen14[] arrayOfDosen) {
        int jmlUsiaPria=0, jmlUsiaWanita=0;
        byte pria=0, wanita=0;
        for (DataDosen14 infoDosen : arrayOfDosen){
            if (infoDosen.jenisKelamin == true) {
                pria++; jmlUsiaPria+=infoDosen.usia;
            } else {
                wanita++; jmlUsiaWanita+=infoDosen.usia;
            }
        }
        System.out.print("Rerata usia dosen Pria   : ");
        if (pria==0){
            System.out.println(0);
        } else {
            System.out.println(jmlUsiaPria/pria);
        }
        System.out.print("Rerata usia dosen Wanita : ");
        if (wanita==0){
            System.out.println(0);
        } else {
            System.out.println(jmlUsiaWanita/wanita);
        }
        System.out.println("--------------------------------------\n");
    } 

    void infoDosenPalingTua(DataDosen14[] arrayOfDosen) {
        DataDosen14 dosenTertua = arrayOfDosen[1];
        for (DataDosen14 infoDosen : arrayOfDosen) {
            if (infoDosen.usia > dosenTertua.usia) {
                dosenTertua = infoDosen;
            }
        }
        System.out.println("Dosen yang paling tua : " + dosenTertua.nama);
    }
    void infoDosenPalingMuda(DataDosen14[] arrayOfDosen) {
        DataDosen14 dosenTermuda = arrayOfDosen[1];
        for (DataDosen14 infoDosen : arrayOfDosen) {
            if (infoDosen.usia < dosenTermuda.usia) {
                dosenTermuda = infoDosen;
            }
        }
        System.out.println("Dosen yang paling muda : " + dosenTermuda.nama);
        System.out.println("--------------------------------------\n");
    }
}