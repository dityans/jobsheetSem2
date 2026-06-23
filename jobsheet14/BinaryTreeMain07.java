package jobsheet14;

public class BinaryTreeMain07 {
    public static void main(String[] args) {
        BinaryTree07 bst = new BinaryTree07();
        bst.add(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa07("244160221", "Badar", "TI-1A", 3.85));
        bst.add(new Mahasiswa07("244160185", "Candra", "TI-1A", 3.21));
        bst.add(new Mahasiswa07("244160220", "Dewi", "TI-1A", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa07("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa07("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        System.out.println("\nIn-order Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPre-order Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPost-order Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa: ");
        bst.delete(3.57);
        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order travesal)): ");
        bst.traverseInOrder(bst.root);

        bst.cariMaxIPK();
        bst.cariMinIPK();
        bst.tampilMahasiswaIPKdiAtas(3.6);
        
    }
}
