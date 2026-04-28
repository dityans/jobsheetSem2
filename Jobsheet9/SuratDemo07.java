package Jobsheet9;
import java.util.Scanner;
public class SuratDemo07 {
    public static void main(String[] args) {
        StackSurat07 stack = new StackSurat07(10);
        Scanner sc = new Scanner(System.in);
        int pilih = -1;

        do{
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMhs = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S: sakit / I: izin): ");
                    char jnsIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi izin: ");
                    int durasi = sc.nextInt();
                    Surat07 srt = new Surat07(idSurat, namaMhs, kelas, jnsIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil diinput\n", srt.namaMahasiswa);
                    break;
                case 2: 
                    Surat07 diproses = stack.pop();
                    if (diproses != null){
                        System.out.println("Id Surat: " + diproses.idSurat);
                        System.out.println("Nama Mahasiswa: " + diproses.namaMahasiswa);
                        System.out.println("Kelas: " + diproses.kelas);
                        System.out.println("Jenis Izin (S: sakit / I: izin): " + diproses.jenisIzin);
                        System.out.println("Durasi izin: " + diproses.durasi);
                        System.out.println("Memperoses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Surat diterima / ditolak (y/n): ");
                        String verivikasi = sc.nextLine();
                        if (verivikasi.equalsIgnoreCase("y")){
                            System.out.println("Surat " + diproses.namaMahasiswa + " berhasil diproses");
                        } else {
                            System.out.println("Surat " + diproses.namaMahasiswa + " ditolak");
                        }
                    }
                    break;
                case 3:
                    Surat07 lihatAtas = stack.peek();
                    if (lihatAtas != null){
                        System.out.println("Surat terakhir dikirim oleh " + lihatAtas.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.searchSurat(cari);
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
