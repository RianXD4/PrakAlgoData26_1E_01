# REPORT

Answer on jobsheet 9.

## Description

My answer on jobsheet 9.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Mahasiswa Mengumpulkan Tugas


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 9\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 9\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasi dikumpulkan

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasi dikumpulkan

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 1
Nama: Tika    
NIM: 1003
Kelas: 1C
Tugas Tika berhasi dikumpulkan

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
```
* Question
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?\
Answer: Kita bisa membalikan tampilan print dari yang terlama ke terbaru.
```java
public void print(){
        for (int i = top; i <= 0; i++) {
                System.out.println(stack[i].nama+"\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
        System.out.println("");
    }
```
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!\
Answer: bisa menampung 5 data tugas mahasiswa
```java
// Main
StackTugasMahasiswa01 stack = new StackTugasMahasiswa01(5);

//Class StackTugasMahasiswa01
public StackTugasMahasiswa01(int sz){
        size = sz;
        stack = new Mahasiswa01[size];
        top = -1;
    }
```
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?\
Answer: agar tidak terjadi out of bound error pada penyimpanan tugas mahasiswa, jika kondisi tersebut dihapus maka sistem akan mencoba untuk menambahkan data mahasiswa ke penyimpanan yang penuh menyebabkan out of bound error.
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!\
Answer: 
```java
//Class StackTugasMahasiswa
 public Mahasiswa01 peekBottom(){
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack Kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
// Main
System.out.println("5. Melihat Tugas Terbawah");
...
case 5:
    Mahasiswa01 lihat1 = stack.peekBottom();
        if (lihat1 != null) {
        System.out.println("Tugas pertama dikumpulkan oleh "+ lihat1.nama);
    }
break;
```
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!\
Answer: Karena top adalah index dari mahasiswa yang paling atas maka
```java
//Class StackTugasMahasiswa
 public int countFilled(){
        return top+1;
    }
//Main
System.out.println("6. Banyak tugas dikumpulkan");
case 6:
    System.out.println("Banyak Tugas yang dikumpulkan: "+stack.countFilled());
break;
```

### 2. Konversi Nilai Tugas ke Biner 


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 9\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 9\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
5. Melihat Tugas Terbawah
6. Banyak tugas dikumpulkan
Pilih: 1
Nama: Budi
NIM: 1009
Kelas: TI
Tugas Budi berhasi dikumpulkan

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
5. Melihat Tugas Terbawah
6. Banyak tugas dikumpulkan
Pilih: 2
Menilai tugas dari Budi
Masukkan nilai (0-100): 87
Nilai Tugas Budi adalah 87
Nilai Biner Tugas: 1010111

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas teratas
4. Melihat daftar Tugas
5. Melihat Tugas Terbawah
6. Banyak tugas dikumpulkan
Pilih: 5
Stack Kosong! tidak ada tugas yang dikumpulkan
```
* Question
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!\
Answer: Pertama dibuat stack baru untuk menyimpan nomor biner, lalu terjadi perulangan. Jika nilai lebih besar dari 0 maka menghitung nilai sisa dan hasilnya di push ke dalam stack lalu nilai dibagi 2. Hal tersebut terjadi hingga nilai sama dengan 0. Setelah itu membuat String biner dan stack di pop dan nilainya akan ditambahkan ke dalam biner dan biner dikembalikan.
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!\
Answer: sistem akan berjalan seperti normal kecuali nilai nya negatif atau dibawah 0 maka sistem akan mencoba untuk membagi nilai negatif tersebut, tetapi hal tersebut tidak realistis dikarenakan nilai tugas tidak bisa negatif.

### 3. Latihan 1


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 9\src\SuratDemo01.java'
```
Or
```bash
cd '.\Pertemuan 9\src\'
java SuratDemo01.java
```
* Output
``` shell
===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 1

Input Surat
input id surat izin: 123
Input Nama Mahasiswa: Budih
Input kelas Mahasiswa: TI
Input Keterangan izin(Sakit/Izin): Izin
Input Durasi surat: 5

===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 1

Input Surat
input id surat izin: 321
Input Nama Mahasiswa: Hidub
Input kelas Mahasiswa: TI
Input Keterangan izin(Sakit/Izin): Sakit
Input Durasi surat: 7

===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 2

Surat yang diproses
123     Budih   TI      I       5
321     Hidub   TI      S       7

===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 3

Surat izin Terakhir
321     Hidub   TI      S       7

===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 4

Nama Mahasiswa yang dicari: Budih
Surat Mahasiswa yang dicari: 
123     Budih   TI      I       5

===========MENU SURAT===========
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Exit
Pilihan: 5
```




## Authors
Adrian Alexander Sanda.
