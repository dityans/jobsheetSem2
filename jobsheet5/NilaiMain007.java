package jobsheet5;
import java.util.Scanner;
public class NilaiMain007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah data nilai: ");
        int jml = input.nextInt();
        input.nextLine();

        Nilai007 daftarNilai[] = new Nilai007[jml];

        for(int i = 0; i < jml; i++){
            System.out.println("Masukan Data Nilai Mahasiswa ke-" + (i+1));
            System.out.print("Nama        :");
            String nama = input.nextLine();
            System.out.print("NIM         :");
            String nim = input.nextLine();
            System.out.print("Tahun Masuk :");
            int tahun = input.nextInt();
            System.out.print("Nilai UTS   :");
            double nilaiUTS = input.nextDouble();
            System.out.print("Nilai UAS   :");
            double nilaiUAS = input.nextDouble();
            input.nextLine();
            System.out.println("---------------------------------");

            daftarNilai[i] = new Nilai007(nama, nim, tahun, nilaiUTS, nilaiUAS);
        }
        Nilai007 kalkulator = daftarNilai[0];
        
        System.out.println("Nilai UTS Tertinggi: " + kalkulator.cariTertinggiDC(daftarNilai, 0, jml-1));
        System.out.println("Nilai UTS Terrendah: " + kalkulator.cariTerrendahDC(daftarNilai, 0, jml-1));
        System.out.println("Rata Rata UAS: " + kalkulator.rataRataUASBF(daftarNilai));

        input.close();
    }
}
