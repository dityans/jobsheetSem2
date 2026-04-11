package jobsheetCM1;

public class Buku07 {
    String kodeBuku, judul, tahunTerbit;

    Buku07(String kd, String jdl, String thn){
        kodeBuku = kd;
        judul = jdl;
        tahunTerbit = thn;
    }

    void tampilBuku(){
        System.out.println("Kode Buku: " + kodeBuku + " | Judul: " + judul + " | Tahun Terbit: " + tahunTerbit);
    }
}