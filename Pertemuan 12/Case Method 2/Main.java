import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        DoubleLinkedList01 listAnt = new DoubleLinkedList01();
        DoubleLinkedList02 listPesan = new DoubleLinkedList02();
        int p;
        do {
            System.out.println("===================================");
            System.out.println("Sistem Antrian Royal Delish");
            System.out.println("===================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            p = Rian.nextInt(); Rian.nextLine();
            switch (p) {
                case 1:
                    System.out.print("Nama Pembeli\t: ");
                    String nama = Rian.nextLine();
                    System.out.print("No HP\t: ");
                    String nohp = Rian.nextLine();
                    Pembeli01 pbl = new Pembeli01(nama, nohp);
                    listAnt.addLast(pbl);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + listAnt.tail.data.noAntrian);
                    break;
                case 2:
                    listAnt.print();
                    break;
                case 3:
                    if (!(listAnt.isEmpty())) {
                        System.out.print("Kode Pesanan\t: ");
                        int kode = Rian.nextInt(); Rian.nextLine();
                        System.out.print("Nama Pesanan\t: ");
                        String namap = Rian.nextLine();
                        System.out.print("Harga\t\t: ");
                        int hrg = Rian.nextInt(); Rian.nextLine();
                        Pesanan01 psn = new Pesanan01(kode, namap, hrg);
                        listPesan.addLast(psn);
                        System.out.println(listAnt.head.data.namaPembeli+" telah memesan "+namap);
                        listAnt.removeFirst();
                    } else {
                        System.out.println("Antrian masih kosong");
                    }
                    break;
                case 4:
                    listPesan.sort();
                    listPesan.print();
                    break;
                case 0:
                    System.out.println("Closing");
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;
            }
        } while (p != 0);
        Rian.close();
    }
}
