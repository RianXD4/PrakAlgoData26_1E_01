public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa01(){

    }

    public Mahasiswa01(String nm, String name, String kls){
        nama = name;
        nim = nm;
        kelas = kls;
        nilai = -1;
    }

    public void tugasDinilai(int nli){
        nilai = nli;
    }  
}