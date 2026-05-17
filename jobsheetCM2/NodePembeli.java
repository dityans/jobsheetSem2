package jobsheetCM2;

public class NodePembeli {
    Pembeli data;
    NodePembeli prev, next;

    public NodePembeli(Pembeli data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
