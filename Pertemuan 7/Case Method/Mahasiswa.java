public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nm, String name, String prd){
        nim = nm;
        nama = name;
        prodi = prd;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: "+nim+" | Nama: "+nama+" | Prodi: "+prodi);
    }
}
