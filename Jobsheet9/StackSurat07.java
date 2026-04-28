package Jobsheet9;

public class StackSurat07 {
    Surat07 stack[];
    int size, top;

    StackSurat07(int size){
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }
    public void push(Surat07 srt){
        if (isFull()){
            System.out.println("Stack penuh");
        } else {
            top++;
            stack[top] = srt;
        }
    }
    public Surat07 pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang diinput.");
            return null;
        } else {
            Surat07 s = stack[top];
            top--;
            return s;
        }
    }
    public Surat07 peek(){
        if(isEmpty()){
            System.out.println("Stack kosong! Tidak ada surat yang diinput.");
            return null;
        } else {
            return stack[top];
        }
    }
    public void searchSurat (String cari){
        int posisi = -1;
        for(int i = top; i >= 0; i--){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)){
                posisi = i;
                break;
            }
        }
        if (posisi == -1){
            System.out.println("Mahasiswa dengan nama " + cari + " tidak ditemukan.");
        } else {
            System.out.println("Mahasiswa dengan nama " + cari + " ditemukan di tumpukan ke- " + (posisi + 1));
        }
    }
}
