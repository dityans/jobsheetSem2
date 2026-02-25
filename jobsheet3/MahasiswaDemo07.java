package jobsheet3;
import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa07 [] arrayOfMahasiswa = new Mahasiswa07 [3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++){
            arrayOfMahasiswa[i] = new Mahasiswa07();

            System.out.println("Masukan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa.length; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakInfo();
        }
        sc.close();
    }
}
