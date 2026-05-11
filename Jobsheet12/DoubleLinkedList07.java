package Jobsheet12;

public class DoubleLinkedList07 {
    Node07 head, tail;

    public DoubleLinkedList07(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa07 data){
        Node07 newNode = new Node07(data);
        if (isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa07 data){
        Node07 newNode = new Node07(data);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa07 data){
        Node07 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null){
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }
        Node07 newNode = new Node07(data);
        if(current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        Node07 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node07 current = tail; 
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}
