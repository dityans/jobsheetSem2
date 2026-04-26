package Jobsheet9;

public class Mahasiswa07 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa07(){}
    Mahasiswa07(String nm, String name, String kls){
        nim = nm;
        nama = name;
        kelas = kls;
        nilai = -1;
    }
    void tugasDinilai(int nil){
        nilai = nil;
    }
}
