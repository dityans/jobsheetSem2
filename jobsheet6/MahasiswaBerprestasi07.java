package jobsheet6;

public class MahasiswaBerprestasi07 {
    Mahasiswa07[] listMhs;
    int idx;

    MahasiswaBerprestasi07(int jumMhs){
        listMhs = new Mahasiswa07 [jumMhs];
    }
    void tambah (Mahasiswa07 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa07 m:listMhs){
            m.tampilInfo();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i ++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp; 
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++){
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa07 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++){
            Mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching (double cari){
        int posisi = -1;
        for(int i = 0; i < listMhs.length; i++){
            if (listMhs[i].ipk == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("Data mahasiswa dengan ipk " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data mahasiswa dengan ipk" + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan ipk" + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].ipk){
                return (mid);
            } else if (listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return - 1;
    }
}
