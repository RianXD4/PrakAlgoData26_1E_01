import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        System.out.print("Masukkan nilai ");
        int nilai = Rian.nextInt();
        Faktorial fk = new Faktorial();
        System.out.println("Niali faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Niali faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
        Rian.close();
        
    }
}
