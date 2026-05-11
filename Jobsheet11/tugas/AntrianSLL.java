package Jobsheet11.tugas;

public class AntrianSLL {
    NodeMahasiswa head, tail;
    int kapasitasAntrian, jumlahAntri;

    AntrianSLL(int n){
        kapasitasAntrian = n;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public boolean isFull(){
        return jumlahAntri == kapasitasAntrian;
    }
    public void tambahAntrian(Mahasiswa input){
        NodeMahasiswa ndInput = new NodeMahasiswa(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
            jumlahAntri++;
        } else if(isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah antrian");
            return;
        } else {
            tail.next = ndInput;
            tail = ndInput;
            jumlahAntri++;
        }
    }
    public void panggilAntrian(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong, tidak dapat dipanggil");
        } else if (head == tail){
            System.out.println("Data Mahasiswa dipanggil:");
            head.data.tampilkanData();
            head = tail = null;
            jumlahAntri--;
        } else {
            System.out.println("Data Mahasiswa dipanggil:");
            head.data.tampilkanData();
            head = head.next;
            jumlahAntri--;
        }
    }
    public void tampilTerdepan(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Data antrian terdepan:");
            head.data.tampilkanData();
        }
    }
    public void tampilTerbelakang(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Data antrian paling akhir:");
            tail.data.tampilkanData();
        }
    }
    public void kosongkanAntrian(){
        if (isEmpty()){
            System.out.println("Antrian sudah kosong");
        } else {
            head = tail = null;
            System.out.println("Antrian telah dikosongkan.");
            jumlahAntri = 0;
        }
    }
}
