public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Mahasiswa01[] arraayofMahasiswa = new Mahasiswa01[3];
        arraayofMahasiswa[0] = new Mahasiswa01();
        arraayofMahasiswa[0].nim = "244107060033";
        arraayofMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arraayofMahasiswa[0].kelas = "SIB-IE";
        arraayofMahasiswa[0].ipk = 3.75f;

        arraayofMahasiswa[1] = new Mahasiswa01();
        arraayofMahasiswa[1].nim = "2341720172";
        arraayofMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arraayofMahasiswa[1].kelas = "TI-2A";
        arraayofMahasiswa[1].ipk = 3.36f;

        arraayofMahasiswa[2] = new Mahasiswa01();
        arraayofMahasiswa[2].nim = "244107023006";
        arraayofMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arraayofMahasiswa[2].kelas = "TI-2E";
        arraayofMahasiswa[2].ipk = 3.8f;

        for (int i = 0; i < arraayofMahasiswa.length; i++) {
            System.out.println("NIM\t: "+arraayofMahasiswa[i].nim);
            System.out.println("NAMA\t: "+arraayofMahasiswa[i].nama);
            System.out.println("KELAS\t: "+arraayofMahasiswa[i].kelas);
            System.out.println("IPK\t: "+arraayofMahasiswa[i].ipk);
            System.out.println("-------------------------------------------------");

        }
    }
}
