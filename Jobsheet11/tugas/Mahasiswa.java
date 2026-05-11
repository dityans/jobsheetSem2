package Jobsheet11.tugas;

public class Mahasiswa {
    String nim, nama, prodi, kelas;

    Mahasiswa(){}
    Mahasiswa(String nm, String name, String kls, String prod){
        nim = nm;
        nama = name;
        prodi = prod;
        kelas = kls;
    }
    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
