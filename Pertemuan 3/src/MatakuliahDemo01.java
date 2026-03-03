import java.util.Scanner;

public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[3];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data Matakuliah ke-"+(i+1));
            arrayOfMatakuliah[i] = new Matakuliah01();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
        System.out.println("Data Matakuliah Ke-"+(i+1));
        arrayOfMatakuliah[i].cetakInfo();
        }
        Rian.close();
        
    }
}
