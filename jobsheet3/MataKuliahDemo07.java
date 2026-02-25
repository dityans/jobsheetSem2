package jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in) ;
        MataKuliah07 [] arrayOfMatakuliah = new MataKuliah07 [3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++){
            System.out.println("Masukan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode       :");
            kode = sc.nextLine();
            System.out.print("Nama       :");
            nama = sc.nextLine();
            System.out.print("Sks        :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah07 ();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++){
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        sc.close();
    }
}
