package Jobsheet11;
import java.util.Scanner;
public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs1 = new Mahasiswa07("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa07 mhs2 = new Mahasiswa07("23212201", "Bimon", "2B", 3.8);
        Mahasiswa07 mhs3 = new Mahasiswa07("22212202", "Cintia", "3C", 3.5);
        Mahasiswa07 mhs4 = new Mahasiswa07("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        Mahasiswa07 mhsBaru = new Mahasiswa07(nim, nama, kelas, ipk);
        sll.addLast(mhsBaru);
        sll.print();
    }
}
