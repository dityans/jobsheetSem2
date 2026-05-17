package jobsheetCM2;

public class Pesanan {
    int kodePesanan, harga;
    String namaPesanan;

    public Pesanan(int a, String b, int d){
        kodePesanan = a;
        namaPesanan = b;
        harga = d;
    }
    public void tampilPesanan(){
        System.out.println(kodePesanan + "\t\t" + namaPesanan + "\t" + harga);
    }
}
