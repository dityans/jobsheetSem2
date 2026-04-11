package jobsheetCM1;

public class Peminjaman07 {
    Mahasiswa07 mhs;
    Buku07 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat, denda;

    Peminjaman07(Mahasiswa07 mh, Buku07 bk, int lama){
        mhs = mh;
        buku = bk;
        lamaPinjam = lama;
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat*2000;
        }
    }

    void tampilPeminjaman(){
        System.out.println("Nama: " + mhs.nama + " | Buku: " + buku.judul + " | lama: " + lamaPinjam + " | terlambat: " + terlambat + " | denda: " + denda);
    }
}