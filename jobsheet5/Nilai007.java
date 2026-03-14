package jobsheet5;

public class Nilai007 {
    String nama, nim;
    int tahunMsk;
    double nilaiUTS, nilaiUAS;

    Nilai007(String nama, String nim, int tahun, double nilaiUTS, double nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMsk = tahun;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    Nilai007(){

    }
    double cariTertinggiDC(Nilai007 daftarNilai[], int low, int high){
        if (low == high){
            return daftarNilai[low].nilaiUTS;
        } else if (high == (low + 1)){
            if (daftarNilai[low].nilaiUTS < daftarNilai[high].nilaiUTS){
                return daftarNilai[high].nilaiUTS;
            } else {
                return daftarNilai[low].nilaiUTS;
            }
        } else {
            int mid = (low + high) / 2;
            double max1 = cariTertinggiDC(daftarNilai, low, mid);
            double max2 = cariTertinggiDC(daftarNilai, (mid + 1), high);

            if (max1 > max2){
                return max1;
            } else {
                return max2;
            }
        }
    }
    double cariTerrendahDC(Nilai007 daftarNilai[], int low, int high){
        if (low == high){
            return daftarNilai[low].nilaiUTS;
        } else if (high == (low + 1)){
            if (daftarNilai[low].nilaiUTS < daftarNilai[high].nilaiUTS){
                return daftarNilai[low].nilaiUTS;
            } else {
                return daftarNilai[high].nilaiUTS;
            }
        } else {
            int mid = (low + high) / 2;
            double min1 = cariTerrendahDC(daftarNilai, low, mid);
            double min2 = cariTerrendahDC(daftarNilai, (mid + 1), high);

            if (min1 < min2){
                return min1;
            } else {
                return min2;
            }
        }
    }
    double rataRataUASBF(Nilai007 daftarNilai[]){
        double totalUAS = 0;
        for (Nilai007 m : daftarNilai) {
            totalUAS += m.nilaiUAS; 
        }
        return totalUAS / daftarNilai.length;
    }
}