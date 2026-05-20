public class doubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size;

    public doubleLinkedList01(){
        head = null;
        tail = null;
        size = 0;
    }

    public void total(){
        System.out.println("size dari DLL adalah "+size);
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
        size++;
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
        size++;
    }

    public void addAt(int idx, Mahasiswa01 dt){
        Node01 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
            if (current == null){
                System.out.println("Data dengan index "+idx+" diluar besar DLL");
                return;
            }
        }

        Node01 newNode = new Node01(dt);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current.prev;
            current.prev = newNode;
            newNode.next = current;
        }
        size++;
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
        size++;
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
        Node01 remove = head;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 remove = tail;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void removeAfter(String keyNIM){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM "+keyNIM+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
        size--;
        
    }

    public void removeAt(int idx){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (idx == 0) {
            removeFirst();
            return;
        }
        Node01 current = head;
        for (int i = 0; i < idx-1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data pada index  "+idx+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
        size--;
    }

    public void getFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        head.data.tampil();
    }
    
    public void getLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        tail.data.tampil();
    }

    public void getIndex(int idx){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
         if (current == null) {
            System.out.println("data pada index  "+idx+" tidak ditemukan.");
            return;
        }
        current.data.tampil();
    }
    
}
