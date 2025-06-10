package Jobsheet11.Tugas;


public class AntrianLayananUK { // Queue - Linked List based
    NodeSLL front, rear;
    int size, max;

    public AntrianLayananUK() {
        front = rear = null;
        size = 0;
        max = 3;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    public void statusAntrian() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
            return;
        }
        if (isFull()) {
            System.out.println(">> Antrian sudah penuh.");
        } else {
            System.out.printf(">> Terdapat sebanyak %d antrian saat ini.%n", size);
        }
    }

    public void addLast(Mahasiswa input) { // Enqueue
            NodeSLL node = new NodeSLL (input, null);
            if (isEmpty()) {
                front = rear = node;
            } else {
                rear.next = node;
                rear = node;
            }
            size++;
            System.out.printf(">> Data %s telah masuk ke antrian.%n", input.nama);
    }

    public void clear() { // Kosongkan Antrian
        front = rear = null;
        size = 0;
        System.out.println(">> Antrian telah dikosongkan.");
    }

    public void removeFirst() { // Dequeue
        if (isEmpty()) {
            System.out.println(">> Antrian masih kosong, tidak ada data yang dapat dihapus");
        } else {
            System.out.printf(">> Antrian a.n %s telah dipanggil%n", front.data.nama);
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void cekAntrian() {
        if (!isEmpty()) {
            System.out.println(">> Antrian terdepan"); front.data.tampilInformasi();
            System.out.println(">> Antrian terakhir"); rear.data.tampilInformasi();
        } else {
            System.out.println(">> Antrian Kosong.");
        }
    }
}
