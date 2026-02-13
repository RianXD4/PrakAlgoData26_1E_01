import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        double nim = Rian.nextDouble();
        double n = nim%100;
        if (n<10) {
            n+=10;
        }
        for (int i = 1; i <= n; i++) {
            if (i==10 || i==15) {
                continue;
            } else if (i%3 == 0) {
                System.out.print(" #");
            } else if (i%2 == 0) {
                System.out.print(" "+i);
            } else {
                System.out.print(" *");
            }
                
        }
    }
}
