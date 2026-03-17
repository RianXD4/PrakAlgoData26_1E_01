public class MainUts {
    public static void main(String[] args) {
        Uts hit = new Uts();
        int[] uts = {78,85,90,76,92,88,80,82};
        int[] uas = {82,88,87,79,95,85,83,84};
        System.out.println("Nilai Uts tertinggi adalah "+hit.nilaitertinggi(uts, 0, uts.length-1));
        System.out.println("Nilai Uts terendah adalah "+hit.nilaiterendah(uts, 0, uts.length-1));
        System.out.println("Rata-Rata nilai Uas adalah "+hit.ratanil(uas));
    }
}
