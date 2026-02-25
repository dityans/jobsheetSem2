package jobsheet3;

public class MataKuliah07 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void cetakInfo() {
        System.out.print("Kode       :" + kode);
        System.out.print("Nama       :" + nama);
        System.out.print("Sks        :" + sks);
        System.out.print("Jumlah Jam :" + jumlahJam);
    }
    public MataKuliah07() {

    }
    public MataKuliah07 (String kode, String nama, int sks, int jumlahJam) { 
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
