import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }

    public int binarySearch(String nim) {
        sortAscending();
        
        Mahasiswa searchKey = new Mahasiswa(nim, "", "");
        
        return Collections.binarySearch(mahasiswas, searchKey, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        
        System.out.println("Data Awal:");
        lm.tampil();
        System.out.println("");

        System.out.println("Sorting Descending berdasarkan NIM:");
        lm.sortDescending();
        lm.tampil();
        System.out.println("");

        int indexSearch = lm.binarySearch("201235");
        if (indexSearch >= 0) {
            lm.update(indexSearch, new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
            System.out.println("Setelah Update menggunakan binarySearch:");
            lm.tampil();
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
}