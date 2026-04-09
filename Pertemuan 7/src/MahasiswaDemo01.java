import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();
        Scanner Rian = new Scanner(System.in);
        int jumMhs = Rian.nextInt();
        list.jmlMahasiswa(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- "+(i+1));
            System.out.print("NIM     : ");
            String nim = Rian.nextLine();
            System.out.print("Nama    : ");
            String nama = Rian.nextLine();
            System.out.print("Kelas   : ");
            String kelas = Rian.nextLine();
            System.out.print("IPK     : ");
            String ip = Rian.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------------------------");
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------------");
        System.out.println("Masukkan ipk Mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = Rian.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearch(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
        System.out.println("------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------------");
        System.out.println("Masukkan Ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = Rian.nextDouble();
        System.out.println("-------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-------------------------");
        double posisi2 = list.finBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
