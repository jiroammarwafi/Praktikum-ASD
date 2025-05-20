package Jobsheet9;
import java.util.Scanner;
public class StackSurat14 {
    Surat14[] stack;
    int top, size;
    Scanner sc = new Scanner(System.in);

    public StackSurat14(int size) {
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push (Surat14 surat) {
        if (isFull()) {
            System.out.println("Stack Penuh! Tidak bisa menambahkan surat lagi");
        } else {
            top++;
            stack[top] = surat;
        }
    }

    public Surat14 pop() {
        if (isEmpty()){
            System.out.println("Stack kosong! Tidak ada surat yang dapat diproses.");
            return null;
        } else {
            Surat14 m = stack[top];
            top--;
            return m;
        }
    }

    public Surat14 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin untuk saat ini");
            return null;
        } else {
            return stack[top];
        }
    }

    void cariSurat (String cari) {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                    System.out.println("Surat ini ditemukan !");
                    String keterangan="";
                    if (stack[i].jenisIzin == 'S') {
                        keterangan = "Sakit";
                    } else if (stack[i].jenisIzin == 'I'){
                        keterangan = "Izin";
                    }
                    System.out.printf("%-10s %-20s %-10s %-15s %-10s%n","ID-Surat", "Nama Mahasiswa", "Kelas", "Jenis Izin", "Durasi");
                    System.out.printf("%-10s %-20s %-10s %-15s %-10s%n", stack[i].idSurat, stack[i].namaMahasiswa, stack[i].kelas, stack[i].jenisIzin + " - " + keterangan, stack[i].durasi);
                    break;
                } 

                if (i == top && !stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                    System.out.println("Tidak ada surat izin atas nama " + cari);
                }
            }
        } else {
                    System.out.println("Tidak ada surat izin atas nama " + cari);
        }
    }

    public char jenisIzin() {
        boolean confirm = true;
        char tmp = ' ';
        while (confirm) {
            System.out.print("Keterangan Izin < S (Sakit) / I (Izin) >: "); 
            tmp = sc.next().toUpperCase().charAt(0);
            if (tmp == 'S' || tmp == 'I') {
                confirm = false;
            } else {
                System.out.println("Input salah, silahkan input ulang");
            }
        }
        return tmp;

    }
}