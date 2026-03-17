import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = Rian.nextInt();
        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = Rian.nextDouble();
        }
        System.out.println("Total Keuntungan menggunakan BF: "+sm.totalBF());
        System.out.println("Total Keuntungan menggunakan DC: "+sm.totalDC(sm.keuntungan,0,elemen-1));
        Rian.close();
    }
}
