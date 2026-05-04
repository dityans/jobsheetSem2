package Jobsheet10;
import java.util.Scanner;
public class LayananKRS {
    public static void main(String[] args) {
        AntrianKRS antri = new AntrianKRS(10);
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian (Proses 2 Orang)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian Saat Ini");
            System.out.println("7. Cetak Total Mahasiswa Sudah KRS");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antri.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antri.panggilAntrian();
                    break;
                case 3:
                    antri.tampilkanSemua();
                    break;
                case 4:
                    antri.lihat2Terdepan();
                    break;
                case 5:
                    antri.lihatTerbelakang();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antri.size);
                    break;
                case 7:
                    System.out.println("Total mahasiswa sudah proses KRS: " + antri.totalDiproses);
                    break;
                case 8:
                    antri.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
