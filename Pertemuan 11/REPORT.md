# REPORT

Answer on jobsheet 11.

## Description

My answer on jobsheet 11.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Pembuatan Single Linked List


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 11\src\SLLMain01.java'
```
Or
```bash
cd '.\Pertemuan 11\src\'
java SLLMain01.java
```
* Output
``` shell
Linked list kosong
Isi Linked List:
8745 / Sinti / 3S / 3.6 / 

Isi Linked List:
8745 / Sinti / 3S / 3.6 / 
6345 / Dirga / 1E / 3.6 / 

Isi Linked List:
8745 / Sinti / 3S / 3.6 / 
9821 / Tony / 3A / 3.6 / 
3465 / Noli / 4D / 3.6 / 
6345 / Dirga / 1E / 3.6 / 
```
* Question
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?\
Answer: karena linked list masih belum diisi dan masih kosong.
2. Jelaskan kegunaan variable temp secara umum pada setiap method!\
Answer: dikarenakan linked list yang dipakai adalah single linked list, maka jika nilai head secara tidak sengaja diambil dari head.next maka tidak bisa kembali ke head yang lama. Temp berguna agar hal tersebut tidak terjadi.
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!\
Answer: Menambahkan object mahasiswa menggunakan Scanner.
```java
while (true){
    System.out.print("NIM   : ");
    String nim = Rian.nextLine();
    System.out.print("Nama  : ");
    String nama = Rian.nextLine();
    System.out.print("Kelas : ");
    String kelas = Rian.nextLine();
    System.out.print("IPK   : ");
    Double ipk = Rian.nextDouble();
    Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
    System.out.print("Input lagi (y/n)? ")
    String inp = Rian.nextLine;
    if(inp == y){
        break;
    }
}
```
### 2.  Modifikasi Elemen pada Single Linked List


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 11\src\SLLMain01.java'
```
Or
```bash
cd '.\Pertemuan 11\src\'
java SLLMain01.java
```
* Output
``` shell 
Linked list kosong
Isi Linked List:
8745 / Sinti / 3S / 3.6 / 

Isi Linked List:
8745 / Sinti / 3S / 3.6 / 
6345 / Dirga / 1E / 3.6 / 

Isi Linked List:
8745 / Sinti / 3S / 3.6 / 
9821 / Tony / 3A / 3.6 / 
3465 / Noli / 4D / 3.6 / 
6345 / Dirga / 1E / 3.6 / 

data index 1 : 
9821 / Tony / 3A / 3.6 / 
Data mahasiswa an Tony berada pada index: 1

Isi Linked List:
9821 / Tony / 3A / 3.6 / 
3465 / Noli / 4D / 3.6 / 

Isi Linked List:
3465 / Noli / 4D / 3.6 / 
```
* Question
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!\
Answer: Agar looping berhenti setelah menemukan key yang dicari.
2. Jelaskan kegunaan kode dibawah pada method remove
```java
temp.next = temp.next.next;
if (temp.next == null) {
    tail = temp;
}
```
Answer: Kode baris 1 berguna untuk menggeser temp.next.next ke posisinnya temp.next maka temp.next yang lama akan di remove tanpa menghilangkan link yang ada. Jika temp.next itu null maka temp akan menjadi tail yang baru.

### 3.  Tugas

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 11\src\AntrianLayanan01.java'
```
Or
```bash
cd '.\Pertemuan 11\src\'
java AntrinLayanan01.java
```
* Output
``` shell 
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 1
        ==== Masukkan Data Mahasiswa ====
NIM   : 123
Nama  : Rian
Kelas : TI

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 1
        ==== Masukkan Data Mahasiswa ====
NIM   : 321
Nama  : Noli
Kelas : SIB

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 1
        ==== Masukkan Data Mahasiswa ====
NIM   : 564
Nama  : Adit
Kelas : TI

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 1
        ==== Masukkan Data Mahasiswa ====
NIM   : 789
Nama  : Nobb
Kelas : SIB

Queue sudah penuh
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 4
        ==== Tampilkan Mahasiswa Antrian ====
NIM / Nama / Kelas
123 / Rian / TI
321 / Noli / SIB
564 / Adit / TI

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 2
        ==== Cek Antrian ====
Antrian Full
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 5
        ==== Tampilkan Mahasiswa Antrian ====
Jumlah mahasiswa dalam Antrian: 3
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 6
        ==== Lihat Mahasiswa ====
1. Mahasiswa Terdepan
2. Mahasiswa Terakhir
Pilih: 1
        === Mahasiswa Terdepan ===
NIM / Nama / Kelas
123 / Rian / TI
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 6
        ==== Lihat Mahasiswa ====
1. Mahasiswa Terdepan
2. Mahasiswa Terakhir
Pilih: 2
        === Mahasiswa Terakhir ===
NIM / Nama / Kelas
564 / Adit / TI
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 3
        ==== Memanggil Antrian ====
NIM / Nama / Kelas
123 / Rian / TI
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 4 
        ==== Tampilkan Mahasiswa Antrian ====
NIM / Nama / Kelas
321 / Noli / SIB
564 / Adit / TI

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 2
        ==== Cek Antrian ====
Jumlah mahasiswa dalam Antrian: 2
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 1
        ==== Masukkan Data Mahasiswa ====
NIM   : 789
Nama  : Nobb
Kelas : TI

        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 6
        ==== Lihat Mahasiswa ====
1. Mahasiswa Terdepan
2. Mahasiswa Terakhir
Pilih: 2
        === Mahasiswa Terakhir ===
NIM / Nama / Kelas
789 / Nobb / TI
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 5
        ==== Tampilkan Mahasiswa Antrian ====
Jumlah mahasiswa dalam Antrian: 3
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 7
        === Mengosongkan Antrian ===
Antrian sudah kosong
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 2
        ==== Cek Antrian ====
Antrian belum ada mahasiswa
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 4
        ==== Tampilkan Mahasiswa Antrian ====
Antrian kosong
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 5
        ==== Tampilkan Mahasiswa Antrian ====
Jumlah mahasiswa dalam Antrian: 0
        ========= MENU ANTRIAN LAYANAN KEMAHASISWAAN =========
1. Masukkan Data Mahasiswa
2. Cek Antrian
3. Memanggil Antrian
4. Tampilkan Mahasiswa Antrian
5. Menampilkan Jumlah Antrian
6. Lihat Mahasiswa
7. Mengosongkan Antrian.
0. Exit
Pilih: 0
```



## Authors
Adrian Alexander Sanda.
