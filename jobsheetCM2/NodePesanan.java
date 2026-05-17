package jobsheetCM2;

public class NodePesanan {
    Pesanan data;
    NodePesanan prev, next;

    public NodePesanan(Pesanan data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
