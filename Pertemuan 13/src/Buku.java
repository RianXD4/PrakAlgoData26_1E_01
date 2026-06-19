public class Buku { //pembuatan class buku
    String kodeBuku, judul, pengarang;
    int tahunTerbit;

    public Buku(){

    }

    public Buku(String kdbuku, String jdl, String pngarang, int tahun){
        kodeBuku = kdbuku;
        judul = jdl;
        pengarang = pngarang;
        tahunTerbit = tahun;
    }

    public void tampilInformasi(){
        System.out.println("Kode Buku: "+kodeBuku+" judul: "+judul+" Pengaran"+" Tahun Terbit: "+tahunTerbit);
    }
}
