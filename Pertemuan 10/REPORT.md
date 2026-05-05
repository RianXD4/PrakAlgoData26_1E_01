# REPORT

Answer on jobsheet 10.

## Description

My answer on jobsheet 10.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Operasi Dasar Queue


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 10\src\QueueDemo01.java'
```
Or
```bash
cd '.\Pertemuan 10\src\'
java QueueDemo01.java
```
* Output
``` shell
Masukkan kapasitas queue: 5
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
1
Masukkan data baru: 123
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
1
Masukkan data baru: 321
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
1
Masukkan data baru: 345
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
2
Data yang dikeluarkan: 123
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
2
Data yang dikeluarkan: 321
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
3
345 
Jumlah elemen = 1
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
4
Elemen terdepan: 345
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
5
Queue berhasil dikosongkan
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------
3
Queue masih kosong
Masukkan operasi yang diingikan: 
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
----------------------

```
* Question
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?\
Answer: Front dan rear bernilai -1 agar dapat mendeteksi jika queue sudah ditaruh nilai atau belum, dan size bernilai 0 karena belum ada nilai yang dimasukkan.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (rear == max - 1) {
    rear = 0;
```
Answer: Potongan kode ini mengecek apakah index rear sudah sampai batas maksimal dan mengubah index rear ke-0 yaitu ke awal. Ini berguna untuk mengisi nilai di tempat yang kosong dalam array pada awal array, agar tidak ada tempat kosong yang terlewatkan.
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
 if (front == max - 1) {
    front = 0;
```
Answer: potongan kode ini hampir sama dengan potongan kode di No 2, bedanya daripada rear yang dipindahkan, sekarang Front yang dipindahkan jika sudah sampai di ujung array. Berguna agar memindahkan pointer front ke tempat index nilai yang selanjutnya.
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?\
Answer: Karena front dari queue tidak selalu index ke-0, nilai front selalu berpindah tempat ke nilai selanjutnya setiap kali terjadinya Dequeue.
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```java
i = (i+1) % max
```
Answer: Kode ini berguna agar tidak terjadinya array overflow dan memindahkan index kembali ke awal array untuk mengprint semua nilai yang ada diantara front dan rear.
6. Tunjukkan potongan kode program yang merupakan queue overflow!\
Answer: Queue overflow terjadi jika array yang sudah penuh dicoba diisi lagi dengan nilai lain. dalam kondisi ini jika terjadi queue overflow maka akan menampilkan informasi Queue sudah penuh.
```java
public void Enqueue(int dt){
    if (isFull()) {
        System.out.println("Queue sudah penuh");
    } else {
        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dt;
        size++;
    }
}
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!\
Answer:
```java
//Bisa menghasilkan queue overflow dan program berhenti.
public void Enqueue(int dt){
        if (isEmpty()) {
            front = rear = 0;
        } else {   
            rear++; 
        }
        data[rear] = dt;
        size++;
}

//Bisa Menghasil queue overflow dan program berhenti.
public int Dequeue(){
    int dt = 0;
        dt = data[front];
        size--;
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
    return dt;
}
```

### 2. Antrian Layanan Akademik


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 10\src\LayananAkademikSIAKAD01.java'
```
Or
```bash
cd '.\Pertemuan 10\src\'
java LayananAkademikSIAKAD01.java
```
* Output
``` shell
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : 123
Nama  : Ari
Prodi : TI
Kelas : 2B
Ari Berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : 234
Nama  : Ira
Prodi : TI
Kelas : 2C
Ira Berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : 654
Nama  : Noli
Prodi : TI
Kelas : 1A
Noli Berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : 789
Nama  : Ilon
Prodi : TI
Kelas : 1B
Ilon Berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : 687
Nama  : Iroh
Prodi : TI
Kelas : 3A
Iroh Berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 1
NIM   : Gus 
Nama  : Re
Prodi : TI 
Kelas : 1A
Queue sudah penuh

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 5
Jumlah dalam antrian: 5

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 4
Daftar Mahasiswa dalam Antrian
NIM - NAMA - PRODI - KELAS
1. 123 - Ari - TI - 2B
2. 234 - Ira - TI - 2C
3. 654 - Noli - TI - 1A
4. 789 - Ilon - TI - 1B
5. 687 - Iroh - TI - 3A
Jumlah elemen = 5

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 3
Nama Mahasiswa terdepan: 
NIM - NAMA - PRODI - KELAS
123 - Ari - TI - 2B

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 2
Melayani Mahasiswa: 123 - Ari - TI - 2B

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih Menu: 0
Terima Kasih. 
```
* Question
1. Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!\
Answer: modifikasi dilakukan di beberapa tempat
```java
//Method ditambahkan kedalam class AntrianLayanana01.java
public void LihatAkhir(){
    if (isEmpty()) {
        System.out.println("Queue Kosong");
    } else {
        System.out.println("Mahasiswa Antrian paling belakang: ");
        data[rear].tampilkanData();
    }
}

//Modifikasi pada main
System.out.println("6. Cek Antrian Paling Belakang"); //Ditambahkan pada menu

//Switch Case baru untuk opsi ke enam.
case 6:
    antrian.LihatAkhir();
break;
```

### 3. Tugas 01.


* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 10\src\LayananKRS01.java'
```
Or
```bash
cd '.\Pertemuan 10\src\'
java LayananKRS01.java
```
* Output
``` shell
=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 1
NIM   : 123
Nama  : Ari
Prodi : TI
Kelas : 1E
Ari Berhasil masuk ke antrian.

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 1
NIM   : 432
Nama  : Ira
Prodi : IT
Kelas : 2E
Ira Berhasil masuk ke antrian.

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 1
NIM   : 765
Nama  : Ari
Prodi : TI
Kelas : 1E
Ari Berhasil masuk ke antrian.

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 1
NIM   : 987 
Nama  : Noli
Prodi : TI  
Kelas : 1E
Noli Berhasil masuk ke antrian.

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 3
Nama Mahasiswa terdepan: 
NIM - NAMA - PRODI - KELAS
123 - Ari - TI - 1E
432 - Ira - IT - 2E

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 4
Daftar Mahasiswa dalam Antrian
NIM - NAMA - PRODI - KELAS
1. 123 - Ari - TI - 1E
2. 432 - Ira - IT - 2E
3. 765 - Ari - TI - 1E
987 - Noli - TI - 1E
Jumlah elemen = 4

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 5
Jumlah Mahasiswa dalam antrian: 4

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 6
Mahasiswa Antrian paling belakang: 
987 - Noli - TI - 1E

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 7
Jumlah Mahasiswa yang sudah melakukan proses KRS: 0

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 2
1. Melayani Mahasiswa: 123 - Ari - TI - 1E
2. Melayani Mahasiswa: 432 - Ira - IT - 2E

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 3
Nama Mahasiswa terdepan: 
NIM - NAMA - PRODI - KELAS
765 - Ari - TI - 1E
987 - Noli - TI - 1E

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 4
Daftar Mahasiswa dalam Antrian
NIM - NAMA - PRODI - KELAS
1. 765 - Ari - TI - 1E
987 - Noli - TI - 1E
Jumlah elemen = 2

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 5
Jumlah Mahasiswa dalam antrian: 2

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 6
Mahasiswa Antrian paling belakang: 
987 - Noli - TI - 1E

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 7
Jumlah Mahasiswa yang sudah melakukan proses KRS: 2

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 8
Queue berhasil dikosongkan

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 4
Queue masih kosong

=== Menu Antrian Layanan KRS ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
7. Jumlah mahasiswa yang sudah TTD KRS
8. Mengosongkan Antrian.
0. Keluar
Pilih Menu: 0
Terima Kasih. 
```



## Authors
Adrian Alexander Sanda.
