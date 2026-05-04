package Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalDiproses = 0;
    final int kuotaDPA = 30; 
    
    public AntrianKRS(int n){
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == max;
    }
    public void clear(){
        if (!isEmpty()){
            front = rear = - 1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (totalDiproses + size >= kuotaDPA) {
            System.out.println("Maaf, pendaftaran gagal. Kuota DPA (30 mahasiswa) sudah terpenuhi!");
            return;
        } else if (isFull()){
            System.out.println("Antrian penuh, belum dapat menambah mahasiswa.");
            return;
        }  else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + "  berhasil masuk antrian.");
        }
    }
    public void panggilAntrian(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
        } else if (size < 2){
            System.out.println("Minimal harus 2 mahasiswa dalam antrian.");
        } else {
            for (int i = 0; i < 2; i++) {
                Mahasiswa diproses = data[front];
                System.out.print((i + 1) + ". ");
                diproses.tampilkanData();
                front = (front + 1) % max;
                size--;
                totalDiproses++;
            }
            System.out.println("Sisa kuota DPA: " + (kuotaDPA - totalDiproses));
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++){
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }
    public void lihat2Terdepan(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else if (size < 2){
            System.out.println("Mahasiswa di antrian kurang dari 2.");
            if (size == 1) data[front].tampilkanData();
        }
        else {
            System.out.println("2 Antrian Terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }
    public void lihatTerbelakang(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
