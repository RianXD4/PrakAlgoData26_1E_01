public class nodePesanan { //pesanan untuk next dan menyimpan data
    nodePesanan next;
    rekap01 data;

    public nodePesanan(rekap01 dt){
        next = null;
        data = dt;
    }

    public void tambah(){
        data.jumlah++;
    }

}
