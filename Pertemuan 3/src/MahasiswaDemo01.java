import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        Mahasiswa01[] arraayofMahasiswa = new Mahasiswa01[3];
        String dummy;
        for (int i = 0; i < arraayofMahasiswa.length; i++) {
            arraayofMahasiswa[i] = new Mahasiswa01();
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM\t:");
            arraayofMahasiswa[i].nim = Rian.nextLine();
            System.out.print("Nama\t:");
            arraayofMahasiswa[i].nama = Rian.nextLine();
            System.out.print("Kelas\t:");
            arraayofMahasiswa[i].kelas = Rian.nextLine();
            System.out.print("IPK\t:");
            dummy = Rian.nextLine();
            arraayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------------------");
        }   
        for (int i = 0; i < arraayofMahasiswa.length; i++) {
            arraayofMahasiswa[i].cetakinfo();
        }

        
        Rian.close();
    }
}
