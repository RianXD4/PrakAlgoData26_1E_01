import java.util.Scanner;

public class SuratDemo01 {
    public static void main(String[] args) {
    StackSurat01 stack = new StackSurat01(5);
    Scanner Rian = new Scanner(System.in); 
    do {
        System.out.println("===========MENU SURAT===========");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.println("5. Exit");
        System.out.print("Pilihan: ");
        int pil = Rian.nextInt();
        Rian.nextLine();
        switch (pil) {
            case 1:
                System.out.println();
                System.out.println("Input Surat");
                System.out.print("input id surat izin: ");
                String id = Rian.nextLine();
                System.out.print("Input Nama Mahasiswa: ");
                String nama = Rian.nextLine();
                System.out.print("Input kelas Mahasiswa: ");
                String kelas = Rian.nextLine();
                System.out.print("Input Keterangan izin(Sakit/Izin): ");
                String ket = Rian.nextLine();
                System.out.print("Input Durasi surat: ");
                int drs = Rian.nextInt();
                stack.push(new Surat01(id,nama,kelas,ket.charAt(0),drs));
                System.out.println();
                
                break;
            case 2:
                System.out.println();
                System.out.println("Surat yang diproses");
                stack.print();
                break;
            case 3:
                System.out.println();
                System.out.println("Surat izin Terakhir");
                Surat01 srt = stack.peek();
                System.out.println(srt.idSurat+"\t"+srt.namaMahasiswa+"\t"+srt.kelas+"\t"+srt.jenisIzin+"\t"+srt.durasi);
                System.out.println();
                break;
            case 4:
                System.out.println();
                System.out.print("Nama Mahasiswa yang dicari: ");
                String nm = Rian.nextLine();
                Surat01 srt2 = stack.cariSurat(nm);
                System.out.println("Surat Mahasiswa yang dicari: ");
                System.out.println(srt2.idSurat+"\t"+srt2.namaMahasiswa+"\t"+srt2.kelas+"\t"+srt2.jenisIzin+"\t"+srt2.durasi);
                System.out.println();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Input Salah coba lagi");
                break;
        }
    } while (true);
    }
}
