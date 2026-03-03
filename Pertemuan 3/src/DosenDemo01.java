import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        System.out.print("Jumlah Dosen: ");
        int n = Rian.nextInt();
        Rian.nextLine();
        Dosen01[] arrayDsn = new Dosen01[n];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;
        for (int i = 0; i < arrayDsn.length; i++) {
            System.out.println("Input Data Dosen ke-"+(i+1));
            System.out.print("Kode\t: ");
            kode = Rian.nextLine();
            System.out.print("Nama\t: ");
            nama = Rian.nextLine();
            System.out.print("Jenis Kelamin(L/P)\t: ");
            dummy = Rian.nextLine();
            if (dummy.equalsIgnoreCase("l")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            System.out.print("Usia\t: ");  
            dummy = Rian.nextLine();
            usia = Integer.parseInt(dummy);
            arrayDsn[i] = new Dosen01(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------------------------");
        }
        DataDosen01.dataSemuaDosen(arrayDsn);
        DataDosen01.infoDosenPalingMuda(arrayDsn);
        DataDosen01.infoDosenPalingTua(arrayDsn);
        DataDosen01.jumlahDosenPerJenisKelamin(arrayDsn);
        DataDosen01.rerataUsiaDosenPerJenisKelamin(arrayDsn);
        Rian.close();
    }
}
