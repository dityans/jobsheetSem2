package Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;
    
    public AntrianLayanan(int n){
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        return size == max;
    }
    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
    public void clear(){
        if (!isEmpty()){
            front = rear = - 1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }  
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + "  berhasil masuk antrian.");
    }
    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    public int getJumlahAntrian(){
        return size;
    }
}
