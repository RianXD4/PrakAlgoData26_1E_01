import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        DataDosen01 list = new DataDosen01();
        Dosen01[] arr = new Dosen01[list.dataDosen.length];
        Scanner Rian = new Scanner(System.in);
        int m;
        boolean don = true;
        while (true) {
            System.out.println("Main Menu");
            System.out.println("---------------------------------");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sort");
            System.out.println("4. Quit");
            System.out.println("---------------------------------");
            System.out.print("ANS: ");
            m = Rian.nextInt();
            Rian.nextLine();
            switch (m) {
                case 1:
                    for (int i = 0; i < list.dataDosen.length; i++) {
                        System.out.println("Data Dosen Ke-" + (i + 1));
                        System.out.print("Kode: ");
                        String kd = Rian.nextLine();
                        System.out.print("Nama: ");
                        String name = Rian.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        String jk = Rian.nextLine();
                        System.out.print("Usia: ");
                        int age = Rian.nextInt();
                        Rian.nextLine();
                        arr[i] = new Dosen01(kd, name, (jk.equalsIgnoreCase("L") ? true : false), age);
                    }
                    list.dataDosen = arr;
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    don = true;
                    while (don) {
                        System.out.println("Sort");
                        System.out.println("---------------------------------");
                        System.out.println("1. Bubble Sort (ASC)");
                        System.out.println("2. Selection Sort (DSC)");
                        System.out.println("3. Insertion Sort (DSC)");
                        System.out.println("---------------------------------");
                        System.out.print("ANS: ");
                        m = Rian.nextInt();
                        Rian.nextLine();
                        switch (m) {
                            case 1:
                                list.sortingASC();
                                don = false;
                                break;
                            case 2:
                                list.sortingDSC();
                                don = false;
                                break;
                            case 3:
                                list.insertionSort();
                                don = false;
                                break;
                            default:
                                System.out.println("Input salah Coba Lagi");
                                don = true;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input salah Coba Lagi");
                    break;
            }
        }
    }
}
