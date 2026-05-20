public class DoubleLinkedList01 {
    node01 head;
    node01 tail;
    int antrian;

    public DoubleLinkedList01(){
        head = null;
        tail = null;
        antrian = 1;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void addLast(Pembeli01 dt){
        dt.noAntrian = antrian;
        node01 newnode = new node01(dt);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        antrian++;
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void print(){
        System.out.println("========================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("========================");
        System.out.printf("%-20s%-20s%-15s\n","No Antrian","Nama","No HP");
        node01 temp = head;
        while (temp!=null) {
                temp.data.tampil();
                temp = temp.next;
        }
    }

}
