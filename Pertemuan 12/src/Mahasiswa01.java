public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa01(String nm, String name, String kls, Double ip){
        nim= nm;
        nama= name;
        kelas=kls;
        ipk=ip;
    }

    public void tampil(){
        System.out.println("NIM\t:"+nim+"\nNama\t:"+nama+"\nKelas\t:"+kelas+"\nIPK\t:"+ipk);
    }
}
