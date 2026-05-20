public class Pembeli01 {
    String namaPembeli;
    String noHP;
    int noAntrian;

    public Pembeli01(String nama, String no){
        namaPembeli = nama;
        noHP = no;
    }

    public void tampil(){
        System.out.printf("%-20d%-20s%-15s\n", noAntrian,namaPembeli,noHP);
    }
}
