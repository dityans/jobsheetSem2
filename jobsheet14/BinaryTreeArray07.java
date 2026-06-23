package jobsheet14;

public class BinaryTreeArray07 {
    Mahasiswa07[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray07(){
        dataMahasiswa = new Mahasiswa07[10];
    }

    void populateData(Mahasiswa07 dataMahasiswa[], int idxLast){
        this.dataMahasiswa = dataMahasiswa;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idx){
        if (idx <= idxLast){
            if (dataMahasiswa[idx] != null){
                traverseInOrder(2 * idx + 1);
                dataMahasiswa[idx].tampilInformasi();
                traverseInOrder(2 * idx + 2);
            }
        }
    }

    // 1. Tambah Method add(Mahasiswa00 data) untuk Array Tree
    public void add(Mahasiswa07 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree Array sudah penuh!");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    // 2. Tambah Method traversePreOrder() untuk Array Tree (Root - Left - Right)
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Cetak Root dulu
                traversePreOrder(2 * idxStart + 1);        // Baru ke Anak Kiri
                traversePreOrder(2 * idxStart + 2);        // Terakhir ke Anak Kanan
            }
        }
    }
}
