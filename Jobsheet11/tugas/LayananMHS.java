package Jobsheet11.tugas;
import java.util.Scanner;

public class LayananMHS {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianSLL antrian = new AntrianSLL(5);
        int pilihan = 0;

        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Cek Antrian paling belakang");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilTerdepan();
                    break;
                case 4:
                    antrian.tampilTerbelakang();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian " + antrian.jumlahAntri);
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
