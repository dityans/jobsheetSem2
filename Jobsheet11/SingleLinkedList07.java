package Jobsheet11;

public class SingleLinkedList07 {
    NodeMahasiswa07 head;
    NodeMahasiswa07 tail;

    boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            NodeMahasiswa07 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa07 input){
        NodeMahasiswa07 ndInput = new NodeMahasiswa07(input, null);
        NodeMahasiswa07 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa07 input){
        if (index < 0){
            System.out.println("Index tidak valid");
        } else if (index == 0){
            addFirst(input);
        } else {
            NodeMahasiswa07 temp = head;
            for (int i=0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa07(input, temp.next);
            if (temp.next.next == null){
                tail = temp.next;
            }
        }
    }
    public void getData(int index){
        NodeMahasiswa07 tmp = head;
        for (int i=0; i < index; i++){
            tmp = tmp.next;
        }
        tmp.data.tampilkanInformasi();
    }
    public int indexOf(String key){
        NodeMahasiswa07 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            NodeMahasiswa07 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa07 temp = head;
            while (temp != null) {
                if((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            NodeMahasiswa07 temp = head;
            for (int i=0; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}
