public class rekap01 { //sebagai object untuk menyimpan data
    String namaPesanan;
    int jumlah;

    public rekap01(String nama) {
        namaPesanan = nama;
        jumlah = 1;
    }

    public void tampil(){
        System.out.printf("%-20s%-10d\n", namaPesanan, jumlah);
    }
}
