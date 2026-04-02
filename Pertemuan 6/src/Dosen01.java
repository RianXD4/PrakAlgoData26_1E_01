public class Dosen01 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen01(String kd,String name,Boolean jk,int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        System.out.println("JenisKelamin: "+(jenisKelamin?"Laki-Laki":"Perempuan"));
        System.out.println("Usia: "+usia);
    }
}
