package jobsheet2;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 matKul1 = new MataKuliah07();
        matKul1.nama = "Algoritma dan Struktur Data";
        matKul1.kodeMk = "2342488";
        matKul1.sks = 2;
        matKul1.jumlahJam = 4;

        matKul1.tampilInformasi();
        matKul1.ubahSKS(3);
        matKul1.tambahJam(1);
        matKul1.kurangiJam(2);
        matKul1.tampilInformasi();

        MataKuliah07 matKul2 = new MataKuliah07("Basis Data", "3273587", 2, 3);
        matKul2.ubahSKS(3);
        matKul2.tampilInformasi();
    }
}
