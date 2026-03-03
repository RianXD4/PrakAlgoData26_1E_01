import java.util.Scanner;

public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data Matakuliah ke-"+(i+1));
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
            arrayOfMatakuliah[i] = new Matakuliah01(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah Ke-"+(i+1));
            System.out.println("Kode\t: "+arrayOfMatakuliah[i].kode);
            System.out.println("Nama\t: "+arrayOfMatakuliah[i].nama);
            System.out.println("Sks\t: "+arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam\t: "+arrayOfMatakuliah[i].jumlahJam);
            System.out.println("--------------------------------------------------");
        }
        Rian.close();
        
    }
}
