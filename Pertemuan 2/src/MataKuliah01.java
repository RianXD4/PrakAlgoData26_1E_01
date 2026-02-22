public class MataKuliah01 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilinformasi(){
        System.out.println("Kode Mata Kuliah: "+kodeMK);
        System.out.println("Nama Mata Kuliah: "+nama);
        System.out.println("Jumlah SKS Mata Kuliah: "+sks);
        System.out.println("Jumlah Jam Mata Kuliah: "+jumlahJam);
    }
    void ubahsks(int sksBaru){
        sks=sksBaru;
        System.out.println("SKS sudah diubah!");
    }
    void tambahJam(int jam){
        jumlahJam+=jam;
    }
    void kurangJam(int jam){
        if (jumlahJam>jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam terbaru: "+jumlahJam); 
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan!");
        }
    }

    public MataKuliah01(){
    }
    public MataKuliah01(String kodeMK,String nama,int sks,int jumlahJam){
        this.kodeMK=kodeMK;
        this.nama=nama;
        this.sks=sks;
        this.jumlahJam=jumlahJam;
    }
}
