public class Surat01 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat01(){

    }

    public Surat01(String idS, String nM, String kls, char Iz, int drs){
        idSurat = idS;
        namaMahasiswa = nM;
        kelas = kls;
        jenisIzin = Iz;
        durasi = drs;
    }
}
