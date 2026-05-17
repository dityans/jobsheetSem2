package jobsheetCM2;

public class Pembeli {
    String namaPembeli, NoHp;
    int noAntrian;

    public Pembeli(String b, String c){
        namaPembeli = b;
        NoHp = c;
    }
    public void tampilPembeli(){
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t" + NoHp);
    }
}
