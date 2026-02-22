public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dsn1 = new Dosen01();
        dsn1.idDosen = "NBR";
        dsn1.nama = "Nobberu";
        dsn1.statusAktif=false;
        dsn1.tahunBergabung = 1999;
        dsn1.bidangKeahlian = "Desain Antarmuka";
        dsn1.tampilinformasi();;
        dsn1.setStatusAktif(true);
        System.out.println("Masa Kerja: "+dsn1.hitungMasaKerja(2026));
        dsn1.ubahKeahlian("UI/UX");
        dsn1.tampilinformasi();

        Dosen01 dsn2 = new Dosen01("AAS", "Adrian Alexander Sanda",true, 2008, "Cyber Security");
        dsn2.tampilinformasi();;
        dsn2.setStatusAktif(false);
        System.out.println(("Masa Kerja: ")+dsn2.hitungMasaKerja(2026));
        dsn2.ubahKeahlian("Nasi Goreng");
        dsn2.tampilinformasi();
    }
}
