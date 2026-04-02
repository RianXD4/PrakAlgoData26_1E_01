import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();
        Mahasiswa01[] arr = new Mahasiswa01[list.listMhs.length];
        Scanner Rian = new Scanner(System.in);
        for (int i = 1; i <= list.listMhs.length; i++) {
            System.out.println("Masukan Data Mahasiswa Ke-"+i);
            System.out.print("Nama: ");
            String nama = Rian.nextLine();
            System.out.print("NIM: ");
            String nim = Rian.nextLine();
            System.out.print("Kelas: ");
            String kls = Rian.nextLine();
            System.out.print("IPK: ");
            Double ipk = Rian.nextDouble();
            arr[i-1] = new Mahasiswa01(nim, nama, kls, ipk);
        }
        for (int i = 0; i < arr.length; i++) {
            list.tambah(arr[0]);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubblesor();
        list.tampil();
    }
}
