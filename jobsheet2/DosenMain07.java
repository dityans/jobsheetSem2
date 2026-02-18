package jobsheet2;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 dosen1 = new Dosen07();
        dosen1.nama = "Budiono Siregar";
        dosen1.idDosen = "38498268938";
        dosen1.tahunBergabung = 1990;
        dosen1.bidangKeahlian = "Basis Data";

        dosen1.setStatusAktif(true);
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " Tahun");
        System.out.println();
        dosen1.ubahKeahlian("Algoritma");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " Tahun");
        System.out.println();

        Dosen07 dosen2 = new Dosen07("8324892", "Supri", 1987, "UI/UX" );
        dosen2.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " Tahun");
        System.out.println();
    }
}
