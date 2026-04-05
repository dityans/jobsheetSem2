package jobsheet6;

public class DosenDemo07 {
    public static void main(String[] args) {
        DataDosen07 list = new DataDosen07();

        Dosen07 dsn1 = new Dosen07("123", "Ali", true, 35);
        list.tambah(dsn1);
        Dosen07 dsn2 = new Dosen07("124", "Budi", true, 56);
        list.tambah(dsn2);
        Dosen07 dsn3 = new Dosen07("125", "Cia", false, 25);
        list.tambah(dsn3);
        Dosen07 dsn4 = new Dosen07("126", "Dono", true, 68);
        list.tambah(dsn4);
        Dosen07 dsn5 = new Dosen07("127", "Edy", true, 47);
        list.tambah(dsn5);
        Dosen07 dsn6 = new Dosen07("128", "Fania", false, 29);
        list.tambah(dsn6);
        Dosen07 dsn7 = new Dosen07("129", "Gia", true, 34);
        list.tambah(dsn7);
        Dosen07 dsn8 = new Dosen07("130", "Heru", true, 54);
        list.tambah(dsn8);
        Dosen07 dsn9 = new Dosen07("131", "Ida", false, 64);
        list.tambah(dsn9);
        Dosen07 dsn10 = new Dosen07("132", "Jeni", false, 30);
        list.tambah(dsn10);

        System.out.println("Data dosen sebelum sorting");
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia (ASC)");
        list.sortingASC();
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia (DESC)");
        list.sortingDESC();
        list.tampil();

        System.out.println("Data dosen setelah sorting menggunakan INSERTION SORT berdasarkan usia (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
