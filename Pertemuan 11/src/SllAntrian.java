public class SllAntrian {
    Node01 head;
    Node01 tail;
    int size;
    int max;
    
    public SllAntrian(){
        size = 0;
    }
    boolean isEmpty(){
        return head==null;
    }
    boolean isFull(){
        return size == max;
    }

    public void print(){
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.println("NIM / Nama / Kelas\t");
            while (tmp != null) {
                tmp.data.tampilinformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void addfirst(Mahasiswa01 input){
        Node01 ndinput = new Node01(input, null);
        if (isFull()) {
           System.out.println("Queue sudah penuh"); 
        } else {
            if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
        size++;
    }
    }
    public void addlast(Mahasiswa01 input){
        Node01 ndinput = new Node01(input, null);
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        }else{
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
        size++;
    }
    }
    public void insertAfter(String key, Mahasiswa01 input){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
        Node01 ndinput01 = new Node01(input, null);
        Node01 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndinput01.next = temp.next;
                temp.next = ndinput01;
                if (ndinput01.next == null) {
                    tail = ndinput01;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
        size++;
        }
    }

    public void insertAt(int idx, Mahasiswa01 input) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
        if (idx < 0) {
            System.out.println("Indeks salah");
        } else if (idx == 0) {
            addfirst(input);
        } else {
            Node01 temp = head;
            for (int i = 0; i < idx-1 ; i++) {
                temp = temp.next;
            }
            temp.next = new Node01(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
        size++;
    }
}

    public void getData(int idx){
        Node01 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilinformasi();
    }

    public int indexOf(String key){
        Node01 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else{
            head = head.next;
            size--;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapu!");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            Node01 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void remove(String key){
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapu!");
        }else{
            Node01 temp = head;
            while (temp!=null) {
                if (temp.data.nama.equalsIgnoreCase(key) && temp == head) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
            size--;
        }
    }

    public void removeAt(int idx){
        if (idx == 0) {
            removeFirst();
        } else {
            Node01 temp = head;
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    public void cekAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian belum ada mahasiswa");
        } else if (isFull()){
            System.out.println("Antrian Full");
        } else {
           jmlhAntri();
        }
    }
    public void jmlhAntri(){
        System.out.println("Jumlah mahasiswa dalam Antrian: "+size);
    }

    public void clear(){
        if (isEmpty()) {
            System.out.println("Antrian Sudah Kosong");
        } else {
            head = tail = null;
            size = 0;
            System.out.println("Antrian sudah kosong");
        }
    }

}
