package jobsheetCM2;
import java.util.Scanner;
public class LayananRoyalDelish {
    static Pembeli inputPembeli(Scanner sc){
        System.out.print("Nama Pembeli: ");
        String nama = sc.nextLine();
        System.out.print("Nomor Telepon: ");
        String no = sc.nextLine();
        Pembeli pbl = new Pembeli(nama, no);
        return pbl;
    }
    static Pesanan inputPesanan(Scanner sc){
        System.out.print("Kode Pesanan: ");
        int kd = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan: ");
        String nama = sc.nextLine();
        System.out.print("Harga Pesanan: ");
        int harga = sc.nextInt();
        sc.nextLine();
        Pesanan psn = new Pesanan(kd, nama, harga);
        return psn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli listPembeli = new DLLPembeli();
        DLLPesanan listPesanan = new DLLPesanan();
        int pilihan = 0;
        do{
            System.out.println("\n==== SISTEM ANTRIAN ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Pembeli pbl = inputPembeli(sc);
                    listPembeli.tambahAntrian(pbl);
                    break;
                case 2:
                    listPembeli.tampilPembeli();
                    break;
                case 3:
                    pbl = listPembeli.hapusAntrian();
                    Pesanan psn = inputPesanan(sc);
                    listPesanan.tambahPesanan(psn);
                    System.out.println(pbl.namaPembeli + " telah membeli " + psn.namaPesanan);
                    break;
                case 4:
                    listPesanan.sortNamaPesanan();
                    listPesanan.printPesanan();
                    System.out.println("Total Pendapatan: " + listPesanan.totalPendapatan);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
}