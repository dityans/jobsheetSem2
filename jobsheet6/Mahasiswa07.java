package jobsheet6;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa07(){}

    Mahasiswa07(String nim, String nama, String kls, double ip){
        this.nim = nim;
        this.nama = nama;
        kelas = kls;
        ipk = ip;
    }

    void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
