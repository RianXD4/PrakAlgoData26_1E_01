public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa01(){

    }
    // Ditambahkan kolom ipk jika mau digunakan pada SLLMain01.java
    public Mahasiswa01(String nm, String name, String kls){
        nim = nm;
        nama = name;
        kelas = kls;
    }

    public void tampilinformasi(){
        System.out.println(nim+" / "+nama+" / "+kelas);
    }
}
