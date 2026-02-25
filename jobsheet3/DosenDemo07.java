package jobsheet3;
import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in) ;
        System.out.print("Masukan Jumlah Data Dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen07 [] arrayOfDosen = new Dosen07 [jumlahDosen];
        String kode, nama, dummy;
        boolean jenisKelamin;
        float usia;

        for (int i = 0; i < arrayOfDosen.length; i++){
            System.out.println("Masukan Data Mata Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Float.parseFloat(dummy);
            System.out.println("---------------------------------");

            arrayOfDosen[i] = new Dosen07 (kode, nama, jenisKelamin, usia);
        }
        for (Dosen07 dsn : arrayOfDosen){
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("---------------------------------");
        }
        sc.close();
    }
}
