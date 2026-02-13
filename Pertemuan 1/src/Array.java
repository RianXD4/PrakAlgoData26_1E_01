import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        String matkul[] = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja",};
        int[] sks = { 2, 2, 2, 2, 2, 2, 3, 2, 2 };
        double nilai[] = new double[8];
        System.out.println("===================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===================");
        System.out.println();
        System.out.println("Masukkan nilai (0 - 100) untuk mata kuliah berikut: ");
        for (int j = 0; j < matkul.length; j++) {
            System.out.print(matkul[j] + ": ");
            nilai[j] = Rian.nextDouble();
            if ((nilai[j] < 0) || (nilai[j] > 100)) {
                System.out.println("COBA LAGI");
                j--;
                continue;
            }
        }
         int ttlsks = 0;
        double bobot = 0;
        String[] hrf = new String[matkul.length];
        Double[] Nset = new Double[matkul.length];
        for (int j = 0; j < nilai.length; j++) {
            if (nilai[j] > 80) {
                hrf[j] = "A";
                Nset[j] = 4d;
            } else if (nilai[j] > 73) {
                hrf[j] = "B+";
                Nset[j] = 3.5;
            } else if (nilai[j] > 65) {
                hrf[j] = "B";
                Nset[j] = 3d;
            } else if (nilai[j] > 60) {
                hrf[j] = "C+";
                Nset[j] = 2.5;
            } else if (nilai[j] > 50) {
                hrf[j] = "C";
                Nset[j] = 2d;
            } else if (nilai[j] > 39) {
                hrf[j] = "D";
                Nset[j] = 1d;
            } else {
                hrf[j] = "E";
                Nset[j] = 0d;
            }
            ttlsks += sks[j];
            bobot += sks[j] * Nset[j];
        }
        
        
        Double iP = bobot / ttlsks;
        String status = "";
        if (iP >= 2) {
            if (hrf[0] == "D") {
                status = "Tidak Lulus Nilai Pancasila Kurang dari C";
            } else {
                status = "Lulus";
            }
        } else {
            status = "Tidak Lulus Indek Prestasi kurang dari 2";
        }
        for (int i = 0; i < hrf.length; i++) {
            if (hrf[i] == "E") {
                status = "Tidak Lulus Terdapat Nilai E";
                break;
            }
        }
        System.out.println();
        System.out.println("================================================================");
        System.out.println("                  HASIL KONVERSI NILAI MAHASISWA                ");
        System.out.println("================================================================");
        System.out.printf("%-5s%-51s%10s%10s%10s%10s%n", "No", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-5d%-51s%10d%10.1f%10s%10.1f%n", (i + 1), matkul[i], sks[i], nilai[i], hrf[i], Nset[i]);
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Total Sks\t: " + ttlsks);
        System.out.println("Total Bobot\t: " + bobot);
        System.out.println("Indeks Prestasi (IP)\t: " + iP);
        System.out.println("Status Semester\t: " + status);
        Rian.close();
    }
}

    