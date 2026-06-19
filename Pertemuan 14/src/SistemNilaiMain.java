import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilaiMain {

    static Queue<Mahasiswa> daftarMahasiswa = new LinkedList<>();
    static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    static List<Nilai> daftarNilai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);

    public static void inisialisasiData() {
        daftarMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        daftarMataKuliah.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public static void menu() {
        System.out.println("*************************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("*************************************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Mahasiswa (Queue)");
        System.out.println("6. Keluar");
        System.out.println("*************************************************");
        System.out.print("Pilih\t: ");
    }

    public static void inputNilai() {
        System.out.println("Masukkan data");
        System.out.print("Kode\t: ");
        String kodeNilai = scStr.nextLine();
        System.out.print("Nilai\t: ");
        double nilaiMhs = sc.nextDouble();
        System.out.println("");

        System.out.println("DAFTAR MAHASISWA");
        System.out.println("*************************************************");
        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "Telf");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.printf("%-10s %-20s %-15s\n", m.nim, m.nama, m.notelp);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nimPilih = scStr.nextLine();

        Mahasiswa mhsDipilih = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.nim.equals(nimPilih)) {
                mhsDipilih = m;
                break;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*************************************************");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.printf("%-10s %-40s %-5s\n", mk.kode, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String mkPilih = scStr.nextLine();

        MataKuliah mkDipilih = null;
        for (MataKuliah mk : daftarMataKuliah) {
            if (mk.kode.equals(mkPilih)) {
                mkDipilih = mk;
                break;
            }
        }

        if (mhsDipilih != null && mkDipilih != null) {
            daftarNilai.add(new Nilai(kodeNilai, nilaiMhs, mhsDipilih, mkDipilih));
            System.out.println("Data nilai berhasil disimpan!");
        } else {
            System.out.println("Data mahasiswa atau mata kuliah tidak ditemukan!");
        }
    }

    public static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
        System.out.println("*************************************************************************");
    }

    public static void cariNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*************************************************************************");
        System.out.print("Masukkan data mahasiswa [nim] : ");
        String cariNim = scStr.nextLine();
        
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        
        for (Nilai n : daftarNilai) {
            if (n.mhs.nim.equals(cariNim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += n.mk.sks;
            }
        }
        System.out.println("Total SKS " + totalSks + " telah diambil.");
        System.out.println("*************************************************************************");
    }

    public static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> Double.compare(n2.nilai, n1.nilai));
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai", "SKS");
        for (Nilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-40s %.2f %-5d\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.nilai, n.mk.sks);
        }
        System.out.println("*************************************************************************");
    }

    public static void hapusMahasiswa() {
        if (!daftarMahasiswa.isEmpty()) {
            Mahasiswa mhsDihapus = daftarMahasiswa.poll();
            System.out.println("Data mahasiswa " + mhsDihapus.nama + " (NIM: " + mhsDihapus.nim + ") berhasil dihapus dari antrean.");
            
            daftarNilai.removeIf(n -> n.mhs.nim.equals(mhsDihapus.nim));
        } else {
            System.out.println("Antrean mahasiswa sudah kosong!");
        }
    }

    public static void main(String[] args) {
        inisialisasiData();
        int pilihan = 0;
        do {
            menu();
            pilihan = sc.nextInt();
            System.out.println();
            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    hapusMahasiswa();
                    break;
                case 6:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 6);
    }
}