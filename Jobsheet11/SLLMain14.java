package Jobsheet11;

public class SLLMain14 {
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();
        Mahasiswa14 mhs1 = new Mahasiswa14("244107020190 (1)", "Jiro", "1E", 3.57);
        Mahasiswa14 mhs2 = new Mahasiswa14("244107020190 (2)", "Rina", "1E", 3.56);
        Mahasiswa14 mhs3 = new Mahasiswa14("244107020190 (3)", "Tomie", "1E", 2.56);
        Mahasiswa14 mhs4 = new Mahasiswa14("244107020190 (4)", "Roku", "1E", 1.56);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Roku", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
