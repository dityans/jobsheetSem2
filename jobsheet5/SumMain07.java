package jobsheet5;
import java.util.Scanner;
public class SumMain07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Elemen: ");
        int elemen = input.nextInt();

        Sum07 sm = new Sum07(elemen);
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukan keuntungan ke-" +(i+1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        
        System.out.println("Total keuntungan menggunakan brute force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan divide and conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));

        input.close();
    }
}
