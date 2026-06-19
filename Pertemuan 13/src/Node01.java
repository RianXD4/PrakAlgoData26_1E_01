public class Node01 { //Modifikasi node agar menggunakan data buku
    Buku buku;
    Node01 left, right;

    public Node01() {
    }

    public Node01(Buku buku) {
        this.buku = buku;
        this.left = null;
        this.right = null;
    }
}
