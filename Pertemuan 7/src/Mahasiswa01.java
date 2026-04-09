public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    Mahasiswa01 (){
    }
    
    Mahasiswa01 (String nm, String name, String kls, Double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilinformasi(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Kelas: "+kelas);
        System.out.println("IPK: "+ipk);
    }
    
}