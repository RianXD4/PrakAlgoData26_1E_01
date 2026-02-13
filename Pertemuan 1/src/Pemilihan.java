import java.util.Scanner;

public class Pemilihan {
    static Scanner Rian = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        
        float nilaiT,nilaiK,nilaiUTS,nilaiUAS;
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiT = input();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiK = input();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input();
        float nilaiAkhir = (nilaiT*0.2f)+(nilaiK*0.2f)+(nilaiUTS*0.3f)+(nilaiUAS*0.4f);
        float nilaiS;
        String nilaiH;

        if (nilaiAkhir>80) {
            nilaiS = 4;
            nilaiH = "A";
        } else if (nilaiAkhir>73) {
            nilaiS = 3.5f;
            nilaiH = "B+";
        } else if (nilaiAkhir>65) {
            nilaiS = 3;
            nilaiH = "B";
        } else if (nilaiAkhir>60) {
            nilaiS = 2.5f;
            nilaiH = "C+";
        } else if (nilaiAkhir>50) {
            nilaiS = 2;
            nilaiH = "C";
        } else if (nilaiAkhir>39) {
            nilaiS = 1;
            nilaiH = "D";
        } else {
            nilaiS = 0;
            nilaiH = "E";
        } 

        String stts;
        if (50>nilaiAkhir) {
            stts = "Selamat Anda TIDAK LULUS";
        } else {
            stts = "Selamat Anda LULUS";
        }
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Nilai Akhir\t:"+nilaiAkhir);
        System.out.println("Nilai Huruf\t:"+nilaiH);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(stts);
    }
    public static float input() {
        float nilai;
        do {
        nilai = Rian.nextFloat();
        if (nilai>100||nilai<0) {
            System.out.println("Nilai tidak Valid");
            System.out.print("Input Nilai Lagi : ");
        }
        } while (nilai>100||nilai<0);
        return nilai;
    } 
}
