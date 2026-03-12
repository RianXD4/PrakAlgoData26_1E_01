public class Kendaraan01 {
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanBakar;

    double efisiensiBBM() { // Menghitung dan mengembalikan tingkat efisiensi BBM
        double tingktEBBm = jarakTempuh / konsumsiBahanBakar;
        return tingktEBBm;
    }

    void printData() { // Menunjukkan data Kendaraan
        System.out.println("=============================================");
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Jarak Tempuh: " + jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar: " + konsumsiBahanBakar);
        System.out.println("Tingkat Efisiensi Bahan Bakar(KM/L): " + efisiensiBBM());
        System.out.println("=============================================");
    }
}
