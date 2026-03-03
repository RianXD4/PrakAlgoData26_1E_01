public class DataDosen01 {

    public static void dataSemuaDosen(Dosen01[] arrayDsn) {
        for (Dosen01 dum : arrayDsn) {
            System.out.println("\tData Dosen");
            System.out.println("Kode\t: " + dum.kode);
            System.out.println("Nama\t: " + dum.nama);
            System.out.println("Jenis Kelamin\t: " + ((dum.jenisKelamin) ? "Laki-Laki" : "Perempuan"));
            System.out.println("Usia\t: " + dum.usia);
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen01[] arrayDsn) {
        int L = 0;
        int P = 0;
        for (int i = 0; i < arrayDsn.length; i++) {
            if (arrayDsn[i].jenisKelamin) {
                ++L;
            } else {
                ++P;
            }
        }
        System.out.println("Jumlah Dosen Laki Laki adalah " + L);
        System.out.println("Jumlah Dosen Perempuan adalah " + P);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayDsn) {
        int L = 0;
        int P = 0;
        int ttlUsiaL = 0;
        int ttlUsiaP = 0;
        for (int i = 0; i < arrayDsn.length; i++) {
            if (arrayDsn[i].jenisKelamin) {
                ++L;
                ttlUsiaL += arrayDsn[i].usia;
            } else {
                ++P;
                ttlUsiaP += arrayDsn[i].usia;
            }
        }
        int rataL = ttlUsiaL / L;
        int rataP = ttlUsiaP / P;
        System.out.println("Rata-rata Usia Dosen Laki-Laki adalah " + rataL);
        System.out.println("Rata-rata Usia Dosen Perempuan adalah " + rataP);
    }

    public static void infoDosenPalingTua(Dosen01[] arrayDsn) {
        int dsnTertua = 0;
        int idx = 0;
        for (int i = 0; i < arrayDsn.length; i++) {
            if (dsnTertua < arrayDsn[i].usia) {
                dsnTertua = arrayDsn[i].usia;
                idx = i;
            }
        }
        System.out.println("DOSEN TERTUA");
        System.out.println("\tData Dosen");
        System.out.println("Kode\t: " + arrayDsn[idx].kode);
        System.out.println("Nama\t: " + arrayDsn[idx].nama);
        System.out.println("Jenis Kelamin\t: " + ((arrayDsn[idx].jenisKelamin) ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia\t: " + arrayDsn[idx].usia);
        System.out.println("--------------------------------------------------------");

    }

    public static void infoDosenPalingMuda(Dosen01[] arrayDsn) {
        int dsnTermuda = 100;
        int idx = 0;
        for (int i = 0; i < arrayDsn.length; i++) {
            if (dsnTermuda > arrayDsn[i].usia) {
                dsnTermuda = arrayDsn[i].usia;
                idx = i;
            }
        }
        System.out.println("DOSEN TERMUDA");
        System.out.println("\tData Dosen");
        System.out.println("Kode\t: " + arrayDsn[idx].kode);
        System.out.println("Nama\t: " + arrayDsn[idx].nama);
        System.out.println("Jenis Kelamin\t: " + ((arrayDsn[idx].jenisKelamin) ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia\t: " + arrayDsn[idx].usia);
        System.out.println("--------------------------------------------------------");
    }
}
