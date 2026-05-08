package Jobsheet11;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa07(){}
    Mahasiswa07(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    public void tampilkanInformasi(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
