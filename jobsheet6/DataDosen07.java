package jobsheet6;

public class DataDosen07 {
    Dosen07[] dataDosen = new Dosen07[10];
    int idx;

    void tambah(Dosen07 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen07 dsn:dataDosen){
            dsn.tampil();
            System.out.println("-----------------------");
        }
    }

    void sortingASC(){
        for (int i=0; i < dataDosen.length - 1; i++){
            for (int j = 1; j < dataDosen.length - i; j++){
                if (dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen07 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp; 
                }
            } 
        }
    }

    void sortingDESC(){
        for (int i = 0; i < dataDosen.length - 1; i++){
            int max = i;
            for (int j = i+1; j < dataDosen.length; j++){
                if (dataDosen[j].usia > dataDosen[max].usia){
                    max = j;
                }
            }
            Dosen07 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++){
            Dosen07 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
