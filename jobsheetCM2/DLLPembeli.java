package jobsheetCM2;

public class DLLPembeli {
    NodePembeli head, tail;
    int size, noAntri;

    public DLLPembeli(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void tambahAntrian(Pembeli data){
        NodePembeli newNode = new NodePembeli(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
            noAntri++;
            newNode.data.noAntrian = noAntri;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            noAntri++;
            newNode.data.noAntrian = noAntri;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntri);
    }

    public void tampilPembeli(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        NodePembeli current = head;
        System.out.println("============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("============================");
        System.out.println("No Antrian\tNama\tNoHP");
        while (current != null) {
            current.data.tampilPembeli();
            current = current.next;
        }
    }

    public Pembeli hapusAntrian(){
        if (isEmpty()){
            System.out.println("Linked list kosong.");
            return null;
        }
        Pembeli pbl = head.data;
        if (head == tail){
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        return pbl;
    }
}
