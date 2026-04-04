package jobsheet6;

public class sortingMain07 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] ={30, 20, 2, 8, 14};

        sorting07 dataUrut1 = new sorting07(a, a.length);
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();
        System.out.println();

        sorting07 dataUrut2 = new sorting07(b, b.length);
        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();
    }
}
