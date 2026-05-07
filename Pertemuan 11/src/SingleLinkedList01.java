public class SingleLinkedList01 {
    Node01 head;
    Node01 tail;
    
    boolean isEmpty(){
        return head==null;
    }

    public void print(){
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilinformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addfirst(Mahasiswa01 input){
        Node01 ndinput = new Node01(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
    }
    public void addlast(Mahasiswa01 input){
        Node01 ndinput = new Node01(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }
    public void insertAfter(String key, Mahasiswa01 input){
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
    }

    public void insertAt(int idx, Mahasiswa01 input) {
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
            System.out.println("Linked list masih kosong, tidak dapat dihapu!");
        } else if (head == tail) {
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapu!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node01 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
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

}
