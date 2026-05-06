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
}
