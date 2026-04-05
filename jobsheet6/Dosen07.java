package jobsheet6;
public class Dosen07 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen07(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia: " + usia);
    }
}
