package Jobsheet9;
import java.util.Scanner;
public class MahasiswaDemo07 {
    public static void main(String[] args) {
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Lihat Jumlah Tugas Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa07 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa07 lihatAtas = stack.peek();
                    if (lihatAtas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatAtas.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5: 
                    Mahasiswa07 lihatBawah = stack.peekBootom();
                    if (lihatBawah != null){
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 6: 
                    System.out.println("Tugas terkumpul sebanyak " + stack.jumTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while(pilih >= 1 && pilih <= 4);
        sc.close();
    } 
}
