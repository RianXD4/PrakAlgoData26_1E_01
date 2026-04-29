import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner Rian = new Scanner(System.in);
        StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);
        int pilih = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Banyak tugas dikumpulkan");
            System.out.print("Pilih: ");
            pilih = Rian.nextInt();
            Rian.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = Rian.nextLine();
                    System.out.print("NIM: ");
                    String NIM = Rian.nextLine();
                    System.out.print("Kelas: ");
                    String Kelas = Rian.nextLine();
                    Mahasiswa01 mhs = new Mahasiswa01(NIM, nama, Kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasi dikumpulkan\n", mhs.nama);
                    break;  
                case 2:
                    Mahasiswa01 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = Rian.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: "+biner);
                    }
                    break;
                case 3:
                    Mahasiswa01 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa01 lihat1 = stack.peekBottom();
                    if (lihat1 != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh "+ lihat1.nama);
                    }
                break;
                case 6:
                    System.out.println("Banyak Tugas yang dikumpulkan: "+stack.countFilled());
                break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        Rian.close();
    }
}
