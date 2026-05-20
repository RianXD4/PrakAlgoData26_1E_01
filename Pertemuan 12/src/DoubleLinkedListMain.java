import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        doubleLinkedList01 list = new doubleLinkedList01();
        int p;
        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            p = Rian.nextInt(); Rian.nextLine();
            switch (p) {
                case 1:
                    Mahasiswa01 mhsAwal=inputMahasiswa(Rian);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa01 mhsAkhir=inputMahasiswa(Rian);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = Rian.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa01 dataBaru = inputMahasiswa(Rian);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();                 
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (p != 0);
        Rian.close();
    }
    
    public static Mahasiswa01 inputMahasiswa(Scanner Rian){
        System.out.print("Masukkan NIM\t: ");
        String nim = Rian.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = Rian.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = Rian.nextLine();
        System.out.print("Masukkan IPK\t: ");
        Double ipk = Rian.nextDouble();
        Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
        return mhs;
    }
}
