package jobsheetCM1;
public class RuangBaca07 {
    Mahasiswa07[] listMhs;
    Buku07[] listBuku;
    Peminjaman07[] listPeminjaman = new Peminjaman07[5];
    int idxMhs;
    int idxBk;
    int idxPj;

    // Menentukan jumlah array Mahasiswa
    void setJumMahasiswa(int jumMhs){
        listMhs = new Mahasiswa07[jumMhs];
    }
    // Menentukan jumlah array Buku
    void setJumBuku(int jumBuku){
        listBuku = new Buku07[jumBuku];
    }
    // Menentukan jumlah array Peminjaman
    void setJumPeminjaman(int jumPinjam){
        listPeminjaman = new Peminjaman07[jumPinjam];
    }
    // Menambah Mahasiswa
    void tambahMahasiswa (Mahasiswa07 m){
        if (idxMhs < listMhs.length) {
            listMhs[idxMhs] = m;
            idxMhs++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    // Menambah Buku
    void tambahBuku (Buku07 b){
        if (idxBk < listBuku.length) {
            listBuku[idxBk] = b;
            idxBk++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    // Menambah Peminjaman
    void tambahPeminjaman (Peminjaman07 p){
        if (idxPj < listPeminjaman.length) {
            listPeminjaman[idxPj] = p;
            idxPj++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    // Menampilkan Data Mahasiswa
    void tampilMhs(){
        for (int i = 0; i < listMhs.length;i++){
            if (listMhs[i] != null){
                listMhs[i].tampilMahasiswa();
            } else {
                break;
            }
        }
    }
    // Menampilkan Data Buku
    void tampilBuku(){
        for (int i = 0; i < listBuku.length; i++){
            if (listBuku[i] != null){
                listBuku[i].tampilBuku();
            } else {
                break;
            }
        }
    }
    // Menampilkan Data Peminjaman
    void tampilPeminjaman(){
        for (int i = 0; i < listPeminjaman.length; i++){
            if (listPeminjaman[i] != null){
                listPeminjaman[i].hitungDenda();
                listPeminjaman[i].tampilPeminjaman();
            } else {
                break;
            }
        }
    }
    // Mengurutkan Denda (dari yang terbesar)
    void urutkanDendaDesc(){
        for (int i = 0; i < listPeminjaman.length - 1; i++){
            int idxMax = i;
            for (int j = i+1; j < listPeminjaman.length; j++){
                if (listPeminjaman[j].denda > listPeminjaman[idxMax].denda){
                    idxMax = j;
                }
            }
            Peminjaman07 tmp = listPeminjaman[idxMax];
            listPeminjaman[idxMax] = listPeminjaman[i];
            listPeminjaman[i] = tmp;
        }
    }
    // Mencari Data Peminjaman Berdasarkan NIM
    int searchPinjamNIM(String cari){
        int posisi = -1;
        for(int i = 0; i < listPeminjaman.length; i++){
            if (listPeminjaman[i].mhs.nim.equals(cari)){
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    // Menampilkan Data Peminjaman Berdasarkan NIM
    void tampilDataSearchPinjam(String cari, int posisi){
        if (posisi != -1){
            listPeminjaman[posisi].hitungDenda();
            listPeminjaman[posisi].tampilPeminjaman();
        } else {
            System.out.println("Data dengan NIM " + cari + " tidak ditemukan");
        }
    }
}
