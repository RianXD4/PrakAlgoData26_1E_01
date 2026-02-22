public class MataKuliahMain01 {
    public static void main(String[] args) {
        MataKuliah01 matKul1 = new MataKuliah01();
        matKul1.kodeMK = "ASD";
        matKul1.nama="Algoritma dan Struktur Data";
        matKul1.sks=6;
        matKul1.jumlahJam=12;
        matKul1.tampilinformasi();
        matKul1.ubahsks(5);
        matKul1.tambahJam(4);
        matKul1.kurangJam(20);
        matKul1.kurangJam(10);
        matKul1.tampilinformasi();

        MataKuliah01 matKul2 = new MataKuliah01("AGM", "Agama", 4, 8);
        matKul2.tampilinformasi();
        matKul2.ubahsks(5);
        matKul2.tambahJam(6);
        matKul2.kurangJam(15);
        matKul2.kurangJam(4);
        matKul2.tampilinformasi();
    }
}
