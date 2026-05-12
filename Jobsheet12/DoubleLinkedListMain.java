package Jobsheet12;
import java.util.Scanner;
public class DoubleLinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList07 list = new DoubleLinkedList07();
        int pilihan = 0;
        do{
            System.out.println("\n===== MENU DOUBLE LINKED LIST ======");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelaha NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa07 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa07 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukan data baru: ");
                    Mahasiswa07 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
    static Mahasiswa07 inputMahasiswa(Scanner sc){
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);
        return mhs;
    }
}
