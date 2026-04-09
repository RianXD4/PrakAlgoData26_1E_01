public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku(String kode, String jdl, int tahun){
        kodeBuku = kode;
        judul = jdl;
        tahunTerbit = tahun;
    }

    void tampilbuku(){
        System.out.println("Kode: "+kodeBuku+" | Judul: "+judul+" | Tahun: "+tahunTerbit);
    }
}
