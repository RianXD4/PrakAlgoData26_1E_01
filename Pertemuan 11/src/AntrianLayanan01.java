import java.util.Scanner;

public class AntrianLayanan01 {
    public static void main(String[] args) {
        SllAntrian sll = new SllAntrian();
        Scanner Rian = new Scanner(System.in);
        sll.max = 3;
        int p;
        do {
        System.out.println("\t========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========");
        System.out.println("1. Masukkan Data Mahasiswa");
        System.out.println("2. Cek Antrian");
        System.out.println("3. Memanggil Antrian");
        System.out.println("4. Tampilkan Mahasiswa Antrian");
        System.out.println("5. Menampilkan Jumlah Antrian");
        System.out.println("6. Lihat Mahasiswa");
        System.out.println("7. Mengosongkan Antrian.");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        p = Rian.nextInt(); Rian.nextLine();
        switch (p) {
            case 1:
                System.out.println("\t==== Masukkan Data Mahasiswa ====");
                System.out.print("NIM   : ");
                String nim = Rian.nextLine();
                System.out.print("Nama  : ");
                String nama = Rian.nextLine();
                System.out.print("Kelas : ");
                String kelas = Rian.nextLine();
                Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas);
                System.out.println();
                sll.addlast(mhs);
                break;
            case 2:
                System.out.println("\t==== Cek Antrian ====");
                sll.cekAntrian();
                break;
            case 3:
                System.out.println("\t==== Memanggil Antrian ====");
                System.out.println("NIM / Nama / Kelas");
                sll.getData(sll.indexOf(sll.head.data.nama));
                sll.removeFirst();
                break;
            case 4:
                System.out.println("\t==== Tampilkan Mahasiswa Antrian ====");
                sll.print();
                break;
            case 5:
                System.out.println("\t==== Tampilkan Mahasiswa Antrian ====");
                sll.jmlhAntri();
                break;
            case 6:
                int l;
                System.out.println("\t==== Lihat Mahasiswa ====");
                System.out.println("1. Mahasiswa Terdepan");
                System.out.println("2. Mahasiswa Terakhir");
                System.out.print("Pilih: ");
                l = Rian.nextInt(); Rian.nextLine();
                if (l == 1) {
                    System.out.println("\t=== Mahasiswa Terdepan ===");
                    System.out.println("NIM / Nama / Kelas");
                    sll.getData(sll.indexOf(sll.head.data.nama));
                } else if (l == 2) {
                    System.out.println("\t=== Mahasiswa Terakhir ===");
                    System.out.println("NIM / Nama / Kelas");
                    sll.getData(sll.indexOf(sll.tail.data.nama));
                } else {
                    System.out.println("Input Invalid");
                }
                break;
            case 7:
                System.out.println("\t=== Mengosongkan Antrian ===");
                sll.clear();
                break;
            case 0:
                System.out.println("Closing");
                break;
            default:
                System.out.println("Input invalid");
                break;
        }
        } while (p != 0);
        Rian.close();
    }
}
