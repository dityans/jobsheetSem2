package jobsheet6;

public class sortingMain07 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        sorting07 dataUrut1 = new sorting07(a, a.length);
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();
    }
}
