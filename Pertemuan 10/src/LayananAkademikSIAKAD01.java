import java.util.Scanner;

public class LayananAkademikSIAKAD01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        AntrianLayanan01 antrian = new AntrianLayanan01(5);
        int p;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            p = Rian.nextInt(); Rian.nextLine();
            switch (p) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = Rian.nextLine();
                    System.out.print("Nama  : ");
                    String nama = Rian.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = Rian.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = Rian.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, prodi, kelas);
                    antrian.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa01 dilayani = antrian.Dequeue();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: "+antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima Kasih. ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (p != 0);
        Rian.close();
    }
}
