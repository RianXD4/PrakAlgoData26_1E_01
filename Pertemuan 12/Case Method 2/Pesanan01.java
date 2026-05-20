public class Pesanan01 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    
    public Pesanan01(int kode, String pesanan, int hrg){
        kodePesanan = kode;
        namaPesanan = pesanan;
        harga = hrg;
    }

    public void tampil(){
        System.out.printf("%-20d%-20s%-20d\n", kodePesanan,namaPesanan,harga);
    }
}
