public class Peminjaman01 {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman01(Mahasiswa m, Buku b, int lP){
        mhs = m;
        buku = b;
        lamaPinjam = lP;
    }
    void hitungDenda(){
        if (lamaPinjam > batasPinjam) {
        terlambat = lamaPinjam - batasPinjam;
        denda = terlambat * 2000;
        } 
    }

    void tampilPeminjaman(){
        System.out.println(mhs.nama+" | "+buku.judul+" | Lama: "+lamaPinjam+" | Terlambat: "+terlambat+" | Denda: "+denda);
    }

}
