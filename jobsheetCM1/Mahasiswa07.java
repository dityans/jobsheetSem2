package jobsheetCM1;

public class Mahasiswa07 {
    String nim, nama, prodi;

    Mahasiswa07(String nm, String name, String prod){
        nim = nm;
        nama = name;
        prodi = prod;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}