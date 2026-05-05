public class Mahasiswa01 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa01(String nm, String name, String prd, String kls){
        nim = nm;
        nama = name;
        prodi = prd;
        kelas = kls;
    }

    public void tampilkanData(){
        System.out.println(nim+" - "+nama+" - "+prodi+" - "+kelas);
    }
}
