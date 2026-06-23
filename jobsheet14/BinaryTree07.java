package jobsheet14;

public class BinaryTree07 {
    Node07 root;

    public BinaryTree07(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa07 mahasiswa){
        Node07 newNode = new Node07(mahasiswa);
        if (isEmpty()){
            root = newNode;
        } else {
            Node07 current = root;
            Node07 parent = null;
            while (true){
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node07 current = root;
        while (current != null){
            if (current.mahasiswa.ipk == ipk){
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node07 node){
        if (node != null){
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node07 node){
        if (node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node07 node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node07 getSuccessor(Node07 del){
        Node07 successorParent = del;
        Node07 successor = del;
        Node07 current = del.right;
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()){
            System.out.println("Tree masih kosong");
            return;
        }
        Node07 current = root;
        Node07 parent = root;
        boolean isLeftChild = false;
        while (current != null){
            if (current.mahasiswa.ipk == ipk){
                break;
            } else if (ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                } else if (isLeftChild){
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.right == null){
                if (current == root){
                    root = current.left;
                } else if (isLeftChild){
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else if (current.left == null){
                if (current == root){
                    root = current.right;
                } else if (isLeftChild){
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else {
                Node07 successor = getSuccessor(current);
                if (current == root){
                    root = successor;
                } else if (isLeftChild){
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

    // Method utama yang dipanggil dari luar class
    public void addRekursif(Mahasiswa07 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    // Helper method untuk melakukan rekursi pencarian posisi node
    private Node07 addRekursifHelper(Node07 current, Mahasiswa07 mahasiswa) {
        if (current == null) {
            return new Node07(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
    
        return current;
    }

    // Menampilkan data mahasiswa dengan IPK paling kecil
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node07 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahasiswa dengan IPK Terkecil: ");
        current.mahasiswa.tampilInformasi();
    }

    // Menampilkan data mahasiswa dengan IPK paling besar
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node07 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahasiswa dengan IPK Terbesar: ");
        current.mahasiswa.tampilInformasi();
    }

    // Method utama untuk memanggil pencarian batas IPK
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("=== Mahasiswa dengan IPK di atas " + ipkBatas + " ===");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    // Helper method rekursif untuk menelusuri tree
    private void tampilIPKdiAtasHelper(Node07 node, double ipkBatas) {
        if (node != null) {
        tampilIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}
