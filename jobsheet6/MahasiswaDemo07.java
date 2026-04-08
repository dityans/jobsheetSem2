package jobsheet6;
import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah data mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumMhs);

        for (int i = 0; i < jumMhs; i++){
            System.out.println("Masukan data mahasiswa " + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();

        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukan IPK yang dicari:");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        // System.out.println("-----------------------------------------------");
        // System.out.println("Menggunakan sequential searching: ");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("-----------------------------------------------");
        System.out.println("Menggunakan binary search: ");
        System.out.println("-----------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("Data mahasiswa sebelum sorting");
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        // list.insertionSort();
        // list.tampil();
        
        sc.close();
    }
}
