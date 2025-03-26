package Jobsheet6;

public class SortingMain14 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting14 dataUrut1 = new Sorting14(a, a.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil(); dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASCENDING)");
        dataUrut1.tampil();

        System.out.println("===========");

        int b[] = {30, 20, 2, 8, 14};
        Sorting14 dataUrut2 = new Sorting14(b, b.length);
        System.out.println("Data Awal 2");
        dataUrut2.tampil(); dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASCENDING)");
        dataUrut2.tampil();

        System.out.println("===========");

        int c[] = {40, 10, 4, 9, 3};
        Sorting14 dataUrut3 = new Sorting14(c, c.length);
        System.out.println("Data Awal 3");
        dataUrut3.tampil(); dataUrut3.SelectionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASCENDING)");
        dataUrut3.tampil();

    }
}
