public class LinkedListRekap {
    nodePesanan head;
    nodePesanan tail;

    public void add(rekap01 dt){ //Method untuk menambahkan pesanan ke dalam rekap
        if (isEmpty()) { //jika Linked list masih kosong
            nodePesanan newnode = new nodePesanan(dt);
            head = tail = newnode;
        }else{
        nodePesanan temp = head;
        while (temp.next != null){
            if (dt.namaPesanan.equalsIgnoreCase(temp.data.namaPesanan)) {
                temp.tambah();
                return;
            }
            temp = temp.next;
        }
        if (!(dt.namaPesanan.equalsIgnoreCase(temp.data.namaPesanan))) { //membuat menu baru untuk menyimpan rekap
            nodePesanan newnode = new nodePesanan(dt);
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    }

    public void print(){ // untuk menampilkan rekap
        System.out.println("========================");
        System.out.println("Daftar Rekap Pemesanan");
        System.out.println("========================");
        System.out.printf("%-20s%-10s\n","Nama Pesanan","Jumlah");
        nodePesanan temp = head;
        while (temp!=null) {
                temp.data.tampil();
                temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
