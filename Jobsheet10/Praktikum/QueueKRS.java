package Jobsheet10.Praktikum;
public class QueueKRS {
    InfoKRS[] data;
    int front, rear, size, max, count = 0;
    
    public QueueKRS() {
        max = 10;
        data = new InfoKRS[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean AntrianKosong() {
        return size == 0;
    }

    public boolean AntrianPenuh() {
        return size == max;
    }

    public void KosongkanAntrian() {
        if (!AntrianKosong()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian KRS kini telah kosong");
        } else {
            System.out.println("Antrian KRS masih kosong");
        }
    }

    public void tambahAntrian(InfoKRS krs) { // Enqueue
        if (AntrianPenuh()) {
            System.out.println("Antrian penuh, tidak dapat menambah KRS lagi.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = krs;
        size++;
        System.out.println(krs.nama + " berhasil masuk ke antrian.");
    }

    public InfoKRS layaniKRS() { // Dequeue
        if(AntrianKosong()) {
            return null;
        }
        InfoKRS krs = data[front];
        front = (front + 1) % max;
        size--;
        count++;
        return krs;
    }

    public void tampilkanSemua() { // Print
        if (AntrianKosong()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar KRS dalam Antrian:");
        System.out.println("NO - NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() { // Peek
        if(AntrianKosong()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("KRS dengan antrian terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            if (size >= 2) {
                data[front+1].tampilkanData();
            } else {
                System.out.println("Hanya terdapat satu antrian saat ini");
            }
        }
    }

    public void LihatAkhir() {
        if(AntrianKosong()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("KRS dengan antrian terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int ApprovedCount() {
        return count;
    }

    public boolean LimitApproval() {
        return count == 30;
    }
}