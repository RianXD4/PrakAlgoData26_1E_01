public class MahasiswaBerprestasi01 {

    Mahasiswa01[] listMhs;
    int idx;
    
    void jmlMahasiswa(int jm){
        listMhs = new Mahasiswa01[jm];
    }

    void tambah(Mahasiswa01 mhs){
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else{
            System.out.println("List Sudah Penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.println("=============================");
            listMhs[i].tampilinformasi();
            System.out.println("=============================");
        }
    }

    int sequentialSearch(double cari){
        int pos = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk==cari) {
                pos=i;
                break;
            }
        }
        return pos;
    }

    void tampilPosisi (double x, int pos){
        if (pos != 1) {
            System.out.println("Data mahasiswa dengan IPK: "+x+" Ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : "+listMhs[pos].nim);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Kelas\t : "+listMhs[pos].kelas);
            System.out.println("IPK\t : "+x);
        } else {
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan.");
        }
    }

    int finBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk<cari) {
                return finBinarySearch(cari, left, mid-1);
            } else {
                return finBinarySearch(cari, mid+1, right);
            }
        } return -1;
    }
}