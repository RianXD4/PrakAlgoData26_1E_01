public class BinaryTreeMain01 {
    public static void main(String[] args) {
        BinaryTree01 bst = new BinaryTree01();

        bst.add(new Buku("14", "Survival 101", "John", 2000));
        bst.add(new Buku("32", "Cooking While the Kitchen On Fire", "Gordon Freeman", 2016));
        bst.add(new Buku("76", "Among Us le book", "Jeremy", 2013));
        bst.add(new Buku("23", "Epstein Files", "Tupac", 2026));
        bst.countBuku(); //Tampil Jumlah Buku

        System.out.println("\nDaftar Buku Tertua ke Terbaru:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian Buku");
        System.out.print("Cari Buku terbit Tahun: 2013 : ");
        String hasilCari = bst.find(2013) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Buku("54", "Python For Smarts??", "Radit", 1999));
        bst.add(new Buku("87", "Bullet Anatomy", "Solid Snake", 2090));
        bst.add(new Buku("99", "Finding Jesus", "Ahab", 2020));

        System.out.println("\nDaftar Buku Tertua ke Terbaru (Setelah Penambahan):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nBuku Terbit Terbaru");
        (bst.getNewestBook()).buku.tampilInformasi();

        System.out.println("\nBuku Terbit Terlama");
        (bst.getOldestBook()).buku.tampilInformasi();

        bst.countBuku();

    }
}
