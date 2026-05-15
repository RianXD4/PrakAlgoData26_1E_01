public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    public DoubleLinkedList01(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa01 dt){
        Node01 newNode = new Node01(dt);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 dt){
        Node01 newNode = new Node01(dt);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNIM, Mahasiswa01 dt){
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM "+keyNIM+" tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(dt);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong: ");
            return;   
        }

        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        Node01 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
