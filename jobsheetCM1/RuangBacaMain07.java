package jobsheetCM1;
import java.util.Scanner;
public class RuangBacaMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RuangBaca07 data = new RuangBaca07();

        data.setJumMahasiswa(3);
        data.tambahMahasiswa(new Mahasiswa07("22001", "andi", "Teknik Informatika"));
        data.tambahMahasiswa(new Mahasiswa07("22002", "budi", "Teknik Informatika"));
        data.tambahMahasiswa(new Mahasiswa07("22003", "citra", "Sistem Informasi Bisnis"));

        data.setJumBuku(4);
        data.tambahBuku(new Buku07("B001", "Algoritma", "2020"));
        data.tambahBuku(new Buku07("B002", "Basis Data", "2019"));
        data.tambahBuku(new Buku07("B003", "Pemograman", "2021"));
        data.tambahBuku(new Buku07("B004", "Fisika", "2024"));

        data.setJumPeminjaman(5);
        data.tambahPeminjaman(new Peminjaman07(data.listMhs[0], data.listBuku[0], 7));
        data.tambahPeminjaman(new Peminjaman07(data.listMhs[1], data.listBuku[1], 3));
        data.tambahPeminjaman(new Peminjaman07(data.listMhs[2], data.listBuku[2], 10));
        data.tambahPeminjaman(new Peminjaman07(data.listMhs[2], data.listBuku[3], 6));
        data.tambahPeminjaman(new Peminjaman07(data.listMhs[0], data.listBuku[1], 4));

        int pilih;
        do {
            System.out.println("\n=== RUANG BACA TI ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Tampilkan Data Peminjaman");
            System.out.println("4. Urutkan berdasarkan denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1: // Daftar Mahasiswa
                    System.out.println("Daftar Mahasiswa: ");
                    data.tampilMhs();
                    break;
                case 2: // Daftar Buku
                    System.out.println("Daftar Buku: ");
                    data.tampilBuku();
                    break;
                case 3: // Data Peminjaman
                    System.out.println("Data Peminjaman: ");
                    data.tampilPeminjaman();
                    break;
                case 4: // Mengurutkan data peminjaman (DESC) 
                    System.out.println("Setelah diurutkan (denda terbesar)");
                    data.urutkanDendaDesc();
                    data.tampilPeminjaman();
                    break;
                case 5: // Mencari data dengan NIM
                    System.out.print("Masukan NIM: ");
                    String cari = sc.nextLine();
                    int posisi = data.searchPinjamNIM(cari);
                    data.tampilDataSearchPinjam(cari, posisi);
                    break;
                case 0: // Keluar
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }   
}
