package Jobsheet12;

public class DoubleLinkedList07 {
    Node07 head, tail;
    int size;

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
            size++;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }

    public void addLast(Mahasiswa07 data){
        Node07 newNode = new Node07(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void addAt(int index, Mahasiswa07 data){
        if (index < 0 || index > size){
            System.out.println("Index tidak valid.");
        } else if (index == 0){
            addFirst(data);
        } else {
            Node07 current = head;
            for(int i=0; i < index - 1; i++){
                current = current.next;
            }
            if(current == tail){
                addLast(data);
            } else {
                Node07 newNode = new Node07(data);
                newNode.prev = current;
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
                size++;
            }
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
            size++;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
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

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list kosong.");
            return;
        }
        System.out.println("Data dihapus:");
        head.data.tampil();
        if (head == tail){
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong.");
            return;
        }
        System.out.println("Data dihapus:");
        tail.data.tampil();
        if (head == tail){
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void removeAfterNIM(String key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            Node07 current = head;
            while (current != null) {
                if (current.data.nim.equalsIgnoreCase(key)){
                    if (current.next != null) { 
                        Node07 temp = current.next;

                        if (temp == tail) {      
                            removeLast();
                        } else {               
                            current.next = temp.next;
                            temp.next.prev = current;
                            size--;
                        }
                        System.out.println("Data setelah nim " + key + " berhasil dihapus.");
                    } else {
                        System.out.println("Tidak ada data setelah nim " + key + " untuk dihapus.");
                    }
                    return;
                }
                current = current.next;
            }
            System.out.println("Data dengan nim " + key + " tidak ditemukan.");
        }
    }

    public void removeAtIndex(int index){
        if (index < 0 || index >= size){
            System.out.println("Index tidak valid.");
        } else if (index == 0){
            removeFirst();
        } else {
            Node07 current = head;
            for(int i=0; i < index - 1; i++){
                current = current.next;
            }
            if(current.next == tail){
                removeLast();
            } else {
                Node07 temp = current.next;
                current.next = temp.next;
                temp.next.prev = current;
                size--;
                System.out.println("Data index " + index + " berhasil dihapus.");
            }
        }
    }

    public void getFirst(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong.");
        } else {
            head.data.tampil();
        }
    }

    public void getLast(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong.");
        } else {
            tail.data.tampil();
        }
    }

    public void getIndex(int index){
        if (index < 0 || index >= size){
            System.out.println("Index tidak valid.");
        } else if (index == 0){
            getFirst();
        } else {
            Node07 current = head;
            for(int i=0; i < index; i++){
                current = current.next;
            }
            if(current == tail){
                getLast();
            } else {
                current.data.tampil();
            }
        }
    }
}
