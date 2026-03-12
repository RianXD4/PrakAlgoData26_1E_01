import java.util.Scanner;

public class KendaraanMain01 {
    public static void main(String[] args) {
        String dummy;
        Scanner Rian = new Scanner(System.in); // Scanner untuk menginput
        System.out.print("Masukan jumlah Atlet: ");
        int n = Rian.nextInt(); // Nilai n untuk banyak array
        Rian.nextLine();
        Kendaraan01[] arrayKndr = new Kendaraan01[n];
        for (int i = 0; i < arrayKndr.length; i++) { // for loop untuk menginput data ke dalam object
            arrayKndr[i] = new Kendaraan01();
            System.out.println("Data Kendaraan ke-" + (i + 1));
            System.out.print("Masukkan Nomor Plat Kendaraan: ");
            arrayKndr[i].nomorPlat = Rian.nextLine();
            System.out.print("Masukkan Jarak Tempuh Kendaraan(KM): ");
            dummy = Rian.nextLine();
            arrayKndr[i].jarakTempuh = Integer.parseInt(dummy);
            System.out.print("Masukkan Konsumsi Bahan Bakar Kendaraan(L): ");
            dummy = Rian.nextLine();
            arrayKndr[i].konsumsiBahanBakar = Integer.parseInt(dummy);
            System.out.println("=============================================");
        }
        double effBBMTerbesar = 0;
        int effBBMLebih10 = 0;
        int idx = 0; // Idx untuk mengambil nomor index
        for (int i = 0; i < arrayKndr.length; i++) { // for loop untuk mencari kendaraan yang paling efisien
            if (arrayKndr[i].efisiensiBBM() > effBBMTerbesar) { // dan juga kendaraan dengan nilai efisiensi lebih dari 10                                                          
                effBBMTerbesar = arrayKndr[i].efisiensiBBM();
                idx = i;
            }
            if (arrayKndr[i].efisiensiBBM() > 10) {
                effBBMLebih10++;
            }

        }

        System.out.println("Data Kendaraan yang paling efisien"); // Menampilakan data kendaraan yang paling efisien
        arrayKndr[idx].printData();

        int presentaseBBMLebih10 = (effBBMLebih10 * 100) / n; // Menghitung presentase kendaraan dengan nilai efisiensi
                                                              // lebih dari 10
        System.out.print("Presentase Kendaraan dengan nilai efisiensi lebih dari 10: " + presentaseBBMLebih10 + "%");
        Rian.close();
    }
}
