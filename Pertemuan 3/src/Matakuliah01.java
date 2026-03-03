import java.util.Scanner;

public class Matakuliah01 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah01(String k, String n, int s, int jJ) {
        this.kode = k;
        this.nama = n;
        this.sks = s;
        this.jumlahJam = jJ;
    }

    public Matakuliah01(){

    }

    void tambahData() {
        String dummy;
        Scanner Rian = new Scanner(System.in);
        System.out.print("Kode\t: ");
        kode = Rian.nextLine();
        System.out.print("Nama\t: ");
        nama = Rian.nextLine();
        System.out.print("Sks\t: ");
        dummy = Rian.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam\t: ");
        dummy = Rian.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("--------------------------------------------------");
    }
}
