import java.util.Scanner;

public class Tugas2 {
    static String info[] = {"Nama Mata Kuliah","Ruang","Hari Kuliah","Jam Kuliah"};
    static Scanner rian = new Scanner(System.in);
    static Scanner rianint = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah jadwal ");
        int n = rianint.nextInt();
        String jadwal[][]= new String[n][4];    
        jadwal = input(jadwal);
        while (true) {
            int pil = menu();
            switch (pil) {
                case 1:
                    tampil(jadwal);
                    break;
                case 2:
                    tampilhar(jadwal);
                    break;
                case 3:
                    tampilmat(jadwal);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Input Invalid");
                    break;
            }
        }
        
        
    }
    public static void tampilhar(String jadwal[][]){
        System.out.print("Input Hari yang ingin ditampilkan : ");
        String hari = rian.nextLine();
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s", info[0], info[1], info[2], info[3]);
        System.out.println("\n-------------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            if (hari.equalsIgnoreCase(jadwal[i][2])) {
                System.out.printf("%-20s%-20s%-20s%-20s", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                System.out.println();
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public static void tampilmat(String jadwal[][]){
         System.out.print("Input Mata Kuliah yang ingin ditampilkan : ");
        String matkul = rian.nextLine();
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s", info[0], info[1], info[2], info[3]);
        System.out.println("\n-------------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            if (matkul.equalsIgnoreCase(jadwal[i][0])) {
                System.out.printf("%-20s%-20s%-20s%-20s", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                System.out.println();
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public static void tampil(String jadwal[][]){
        System.out.printf("%-20s%-20s%-20s%-20s", info[0], info[1], info[2], info[3]);
       System.out.println("\n-------------------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-20s%-20s%-20s%-20s", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public static String[][] input (String jadwal[][]){
        for ( int i = 0; i < jadwal.length; i++) {
            System.out.println("JADWAL KE-"+(1+i));
            for (int j = 0; j < jadwal[i].length; j++) {
                System.out.print("Masukkan "+info[j]+" : ");
                jadwal[i][j]=rian.nextLine(); 
                
            }
        }
        return jadwal;
    }
    public static int menu(){
        System.out.println("\n1. Tampilkan seluruh jadwal");
        System.out.println("2. Tampilkan Berdasarkan Hari");
        System.out.println("3. Tampilkan Berdasarkan Mata Kuliah");
        System.out.println("4. Exit");
        System.out.print("Pilih : ");
        int pil = rianint.nextInt();
        return pil;
    }
}
