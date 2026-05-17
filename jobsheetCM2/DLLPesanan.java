package jobsheetCM2;

public class DLLPesanan {
    NodePesanan head, tail;
    int size, totalPendapatan;

    public DLLPesanan(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void tambahPesanan(Pesanan data){
        NodePesanan newNode = new NodePesanan(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
            totalPendapatan += data.harga;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            totalPendapatan += data.harga;
        }
    }
    public void printPesanan(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        System.out.println("===================================");
        System.out.println("Laporan Pesanan (Urut Nama Pesanan)");
        System.out.println("===================================");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        NodePesanan current = head;
        while (current != null) {
            current.data.tampilPesanan();
            current = current.next;
        }
    }
    public void sortNamaPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;
        do {
            tukar = false;
            NodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
}