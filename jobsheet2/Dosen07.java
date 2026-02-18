package jobsheet2;

public class Dosen07 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    void tampilInformasi(){
        System.out.println("Nama Dosen: " + nama);
        System.out.println("id Dosen: "+ idDosen);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int tahunSkr){
        return tahunSkr - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    public Dosen07 (){

    }
    public Dosen07 (String idDosen, String nama, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
