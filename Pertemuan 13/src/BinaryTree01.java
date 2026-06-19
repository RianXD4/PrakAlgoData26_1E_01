public class BinaryTree01 {
    Node01 root;
    int size;

    public BinaryTree01() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Buku buku) { //modifikasi untuk menambahkan buku menggunakan tahun terbit
        Node01 newNode = new Node01(buku);
        size++; //size +1 saat menambahkan
        if (isEmpty()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while (true) {
                parent = current;
                if (buku.tahunTerbit < current.buku.tahunTerbit) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(int tahunTerbit) { //Pencarian menggunakan Tahun Terbit
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.buku.tahunTerbit == tahunTerbit) {
                result = true;
                break;
            } else if (tahunTerbit > current.buku.tahunTerbit) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node01 node) {
        if (node != null) {
            node.buku.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node01 node) { //Menampilkan Buku dari tahun terbit terlama ke terbaru
        if (node != null) {
            traverseInOrder(node.left);
            node.buku.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.buku.tampilInformasi();
        }
    }

    public Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int tahunTerbit) { //Modifikasi delete agar bisa menghapus dengan data buku
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.buku.tahunTerbit == tahunTerbit) {
                break;
            } else if (tahunTerbit < current.buku.tahunTerbit) { // IPK diganti menjadi Tahun Terbit
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (tahunTerbit > current.buku.tahunTerbit) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            size--; //size -1 saat delete
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } 
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } 
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } 
            else {
                Node01 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public Node01 getNewestBook(){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return null;
        }
        Node01 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

     public Node01 getOldestBook(){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return null;
        }
        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void addRekursif(Node01 current, Node01 add){
        Node01 parent = current;
        if (add.buku.tahunTerbit < current.buku.tahunTerbit) {
            current = current.left;
            if (current == null) {
                parent.left = add;
            }
            addRekursif(current, add);
        } else {
            current = current.right;
            if (current == null) {
                parent.right = add;
            }
            addRekursif(current, add);
        }
    }

   public void tampilBukuDiatasTahun(Node01 node, int tahunTerbit) {
    if (node != null) {
        tampilBukuDiatasTahun(node.left, tahunTerbit);
        if (node.buku.tahunTerbit > tahunTerbit) {
            node.buku.tampilInformasi();
        }
        tampilBukuDiatasTahun(node.right, tahunTerbit);
        }
    }

    public void countBuku(){ //Menampilkan jumlah buku dari jumlah size
        System.out.println("Jumlah Buku yang ada: "+size);
    }

    
}
