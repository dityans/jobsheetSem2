package jobsheet2;

public class MataKuliah07 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jmlTambahJam){
        jumlahJam += jmlTambahJam;
    }
    void kurangiJam(int jmlKurangiJam){
        if (jmlKurangiJam > jumlahJam){
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jmlKurangiJam;
        }
    }
    public MataKuliah07(){

    }
    public MataKuliah07(String nama, String kodeMk, int sks, int jumlahJam){
        this.nama = nama;
        this.kodeMk = kodeMk;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
