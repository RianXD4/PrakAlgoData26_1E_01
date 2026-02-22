public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilinformasi(){
        System.out.println("ID Dosen: "+idDosen);
        System.out.println("Nama Dosen: "+nama);
        System.out.println("Status Aktif Dosen: "+(statusAktif?"Aktif":"Tidak Aktif"));
        System.out.println("Tahun Bergabung Dosen: "+ tahunBergabung);
        System.out.println("Bidang Keahlian Dosen: "+bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg){
        int tahunKerja = thnSkrg-tahunBergabung;
        return tahunKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian=bidang;
    }
    public Dosen01(){

    }
    public Dosen01(String idDosen,String nama, boolean statusAktif,int tahunBergabung,String bidangKeahlian){
        this.idDosen=idDosen;
        this.nama=nama;
        this.statusAktif=statusAktif;
        this.tahunBergabung=tahunBergabung;
        this.bidangKeahlian=bidangKeahlian;
    }
}
