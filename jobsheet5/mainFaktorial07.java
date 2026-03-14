package jobsheet5;
import java.util.Scanner;

public class mainFaktorial07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = input.nextInt();

        faktorial07 fk = new faktorial07();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        input.close();
    } 
}
