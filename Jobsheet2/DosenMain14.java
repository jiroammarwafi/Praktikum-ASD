import java.util.Scanner;
public class DosenMain14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int thnSkrg = 2025;
        String type;

        Dosen14 dsn1 = new Dosen14();
        System.out.println();
        dsn1.idDosen = "VNW";
        dsn1.nama = "Vivi Nur Wijayaningrum, S.Kom, M.Kom";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2012;
        dsn1.bidangKeahlian = "IT-1";
        dsn1.tampilInformasi();
        System.out.println("Lama Bekerja: " + dsn1.hitungMasaKerja(thnSkrg) + " tahun");
        System.out.print("Ingin Mengubah bidang keahlian (yes/no) ?: ");
        type = in.nextLine();

            if (type.toLowerCase().equals("yes")) {
                System.out.print("Bidang Keahlian yang baru: ");
                String bidang = in.next();
                dsn1.ubahKeahlian(bidang);
                System.out.println("Bidang telah berubah.");
                dsn1.tampilInformasi();
            } else {
                System.out.println("Bidang Keahlian tidak berubah.");
            }

        System.out.println();
        Dosen14 dsn2 = new Dosen14("VIT", "Vit Zuraida, S.Kom., M.Kom.",
         true, 2014, "IT-2");
        dsn2.tampilInformasi();
        System.out.println("Lama Bekerja: " + dsn2.hitungMasaKerja(thnSkrg) + " tahun");
        System.out.print("Ingin Mengubah bidang keahlian (yes/no) ?: ");
        type = in.next();

        if (type.toLowerCase().equals("yes")) {
            System.out.print("Bidang Keahlian yang baru: ");
            String bidang = in.next();
            dsn2.ubahKeahlian(bidang);
            System.out.println("Bidang telah berubah.");
            System.out.println();
            dsn2.tampilInformasi();
        } else {
            System.out.println("Bidang Keahlian tidak berubah.");
        }
        in.close();
    }
}
