package jobsheet5;
import java.util.Scanner;
public class pangkatMain07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat07[] png = new pangkat07[elemen];
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukan basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat07(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTE FORCE:");
        for (pangkat07 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (pangkat07 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

        input.close();
    }
}
