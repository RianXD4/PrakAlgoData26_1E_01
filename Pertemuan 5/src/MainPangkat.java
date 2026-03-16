import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen: ");
        int elemen = Rian.nextInt();
        Pangkat[] arrPang = new Pangkat[elemen];
        for (int i = 0; i < arrPang.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = Rian.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = Rian.nextInt();
            arrPang[i]= new Pangkat(basis, pangkat);
        }
        System.out.println("Hasil Pangkat BF");
        for (Pangkat pangkat : arrPang) {
            System.out.println(pangkat.nilai+"^"+pangkat.pangkat+": "+pangkat.pangkatBF(pangkat.nilai, pangkat.pangkat));
        }
        System.out.println("Hasil Pangkat DC");
        for (Pangkat pangkat : arrPang) {
            System.out.println(pangkat.nilai+"^"+pangkat.pangkat+": "+pangkat.pangkatDC(pangkat.nilai, pangkat.pangkat));
        }
        Rian.close();
    }
}
