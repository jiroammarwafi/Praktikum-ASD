package Jobsheet12;

public class DoubleLinkedLists {
    Node14 head, tail;
    int size = 0;
    
    public DoubleLinkedLists() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
                System.out.println("Data telah masuk !");

        size++;
    }

    public void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
                System.out.println("Data telah masuk !");

        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa14 data) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node14 newNode = new Node14(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    // Modifikasi 1
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih dalam keadaan kosong");
            return;
        } else {
            Node14 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.print("Data ini telah dihapus: "); head.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.print("Data ini telah dihapus: "); tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public Node14 search(String nim){
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void addByIndex(int cari, Mahasiswa14 data) {
        if (isEmpty()) {
            System.out.println("Tidak ada node yang tercatat.");
            return;
        } else {
            Node14 temp = head;
            int index = 0;
            while (index != cari) {
                temp = temp.next;
                index++;
            }

            if (temp == head) {
                addFirst(data); 
                return;
            } 
            if (temp == tail) {
                addLast(data);
                return;
            } else {
                Node14 newNode = new Node14(data);
                temp.prev.next = newNode;
                newNode.next = temp;
                temp.prev = newNode;
                size++;
                System.out.println("Data telah masuk !");
            }
        }
    }

    public void removeByIndex(int cari) {
        if (isEmpty()) {
            System.out.println("Tidak ada node yang tercatat.");
            return;
        } else {
            Node14 temp = head;
            int index = 0;
            while (index != cari) {
                temp = temp.next;
                index++;
            }
            if (temp == tail) {
                removeLast();
                return;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                size--;
                System.out.println("Data telah dihapus !");
            }
        }
    }

    public void getSize() {
        System.out.printf("Jumlah data/size saat ini: %d%n", size);
    }

    public void getFirst() {
        head.data.tampil();
    }

    public void getLast() {
        tail.data.tampil();
    }

    public void getIndex(int cari) {
        int index = 0;
        Node14 sweep = head;
        while (index != cari) {
            sweep = sweep.next;
            index++;
        } sweep.data.tampil();
    }

    public void removeAfter(String keyNim) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == tail) {
            removeLast();
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;
        System.out.printf("Node setelah NIM %s telah dihapus", keyNim);
    }
}