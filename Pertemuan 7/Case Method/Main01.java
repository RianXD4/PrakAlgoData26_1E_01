import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        String[][] dataStr = {
        {"22001","22002","22003"}, //0
        {"Andi","Budi","Citra"}, //1
        {"Teknik Informatika","Teknik Informatika","Sistem Informasi Bisnis"}, //2
        {"B001","B002","B003","B004"}, //3
        {"Algoritman","Basis Data","Pemrograman","Fisika"} //4
        };
        int[] dataInt = {2020,2019,2021,2024};
        
        Mahasiswa []mhs = new Mahasiswa[3];
        Buku[] buku = new Buku[4];
        Peminjaman01[] list = new Peminjaman01[5];
        for (int i = 0; i < mhs.length; i++) {
           mhs[i] = new Mahasiswa(dataStr[0][i], dataStr[1][i], dataStr[2][i]);
        }
        for (int i = 0; i < buku.length; i++) {
            buku[i] = new Buku(dataStr[3][i], dataStr[4][i], dataInt[i]);
        }
            list[0] = new Peminjaman01(mhs[0], buku[0], 7);
            list[1] = new Peminjaman01(mhs[1], buku[1], 3);
            list[2] = new Peminjaman01(mhs[2], buku[2], 10);
            list[3] = new Peminjaman01(mhs[2], buku[3], 6);
            list[4] = new Peminjaman01(mhs[1], buku[2], 4);
            for (int i = 0; i < list.length; i++) {
                list[i].hitungDenda();
            }
        int menu;
        while (true) {
            System.out.println();
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampikan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = Rian.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("");
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("");
                    for (int i = 0; i < buku.length; i++) {
                        buku[i].tampilbuku();
                    }
                    
                    break;

                case 3:
                    System.out.println("");
                    for (int i = 0; i < list.length; i++) {
                        list[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    Peminjaman01[] sort = new Peminjaman01[list.length];
                    for (int i = 0; i < sort.length; i++) {
                        sort[i] = list[i];
                    }
                    for (int i = 0; i < sort.length; i++) {
                        Peminjaman01 temp = sort[i];
                        int j = i;
                        while (j > 0 && sort[j-1].denda < temp.denda) {
                            sort[j] = sort[j-1];
                            j--;
                        }
                        sort[j] = temp;
                    }
                    System.out.println("");
                    System.out.println("Setelah diurutkan (Denda Terbesar)");
                    for (int i = 0; i < sort.length; i++) {
                        sort[i].tampilPeminjaman();
                    }
                    break;

                case 5:
                    Mahasiswa[] sorte = mhs;
                    for (int i = 1; i < sorte.length; i++) {
                        Mahasiswa temp = sorte[i];
                        int temp2 = Integer.parseInt(temp.nim);
                        int j = i;
                        int temp3 = Integer.parseInt(sorte[j-1].nim);
                        while (j > 0 && temp3 > temp2 ) {
                            sorte[j] = sorte[j-1];
                            j--;
                            temp3 = Integer.parseInt(sorte[j].nim);
                        }
                        sorte[j] = temp;
                    }
                    System.out.print("Masukkan NIM: ");
                    int cari = Rian.nextInt();
                    int idx = binarySearch(cari, 0, list.length, mhs);
                    if (idx != -1) {
                    for (int i = 0; i < list.length; i++) {
                            if (list[i].mhs.nim == mhs[idx].nim) {
                                list[i].tampilPeminjaman();
                            }
                        }
                    } else {
                        System.out.println("NIM: "+cari+" Tidak Ditemukan");
                    }
                    break;

                case 0:
                    Rian.close();
                    System.exit(0);
                    break;
                    
                default:
                    break;
            }
        }
    }

    public static int binarySearch(int cari, int left, int right,Mahasiswa[] mhs){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            int temp = Integer.parseInt(mhs[mid].nim);
            if (cari == temp) {
                return mid;
            } else if (temp>cari) {
                return binarySearch(cari, left, mid-1, mhs);
            } else {
                return binarySearch(cari, mid+1, right, mhs);
            }
        }
        return -1;
    }
}
