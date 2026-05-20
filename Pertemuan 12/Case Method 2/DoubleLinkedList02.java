public class DoubleLinkedList02 {
    node02 head;
    node02 tail;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan01 dt) {
        node02 newnode = new node02(dt);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void print() {
        System.out.println("========================");
        System.out.println("Laporan Pesanan");
        System.out.println("========================");
        System.out.printf("%-20s%-20s%-20s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        node02 temp = head;
        while (temp!=null) {
                temp.data.tampil();
                temp = temp.next;
        }
    }

   public void sort() {
    if (isEmpty() || head == tail) {
        return;
    }
    boolean swap;
    node02 current;
    do {
        swap = false;
        current = head;
        while (current.next != null) {
            if (current.data.namaPesanan.compareTo(current.next.data.namaPesanan) > 0) {
                Pesanan01 temp = current.data;
                current.data = current.next.data;
                current.next.data = temp;
                swap = true;
            }
            current = current.next;
        }
    } while (swap);
}
}
