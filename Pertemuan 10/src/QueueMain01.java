import java.util.Scanner;

public class QueueMain01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = Rian.nextInt();
        Queue01 Q = new Queue01(n);
        int p = 0;
        do {
            menu();
            p = Rian.nextInt();
            switch (p) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = Rian.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (p >= 1 || p <= 5);
    }




    public static void menu(){
        System.out.println("Masukkan operasi yang diingikan: ");
        System.out.println("1.  Enqueue");
        System.out.println("2.  Dequeue");
        System.out.println("3.  Print");
        System.out.println("4.  Peek");
        System.out.println("5.  Clear");
        System.out.println("----------------------");
    }
}
