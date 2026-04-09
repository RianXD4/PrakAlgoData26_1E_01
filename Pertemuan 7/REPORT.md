# REPORT

Answer on jobsheet 7.

## Description

My answer on jobsheet 7.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Searching/ Pencarian Menggunakan Algoritma Sequential Search

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 7\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 7\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Masukkan Data Mahasiswa ke- 1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.6
------------------------------------------------
Masukkan Data Mahasiswa ke- 2
NIM     : 222
Nama    : Tio
Kelas   : 2
IPK     : 3.8
------------------------------------------------
Masukkan Data Mahasiswa ke- 3
NIM     : 333
Nama    : Ila
Kelas   : 2
IPK     : 3.0
------------------------------------------------
Masukkan Data Mahasiswa ke- 4
NIM     : 444
Nama    : Lia
Kelas   : 2
IPK     : 3.5
------------------------------------------------
Masukkan Data Mahasiswa ke- 5
NIM     : 555
Nama    : Fia
Kelas   : 2
IPK     : 3.3
------------------------------------------------
Mahasiswa ke-1
=============================
NIM: 111
Nama: Adi
Kelas: 2
IPK: 3.6
=============================
Mahasiswa ke-2
=============================
NIM: 222
Nama: Tio
Kelas: 2
IPK: 3.8
=============================
Mahasiswa ke-3
=============================
NIM: 333
Nama: Ila
Kelas: 2
IPK: 3.0
=============================
Mahasiswa ke-4
=============================
NIM: 444
Nama: Lia
Kelas: 2
IPK: 3.5
=============================
Mahasiswa ke-5
=============================
NIM: 555
Nama: Fia
Kelas: 2
IPK: 3.3
=============================
------------------------------------------------
Pencarian Data
------------------------------------------------
Masukkan ipk Mahasiswa yang dicari
IPK: 3.5
Menggunakan sequential searching
Data mahasiswa dengan IPK: 3.5 Ditemukan pada indeks 3
NIM      : 444
Nama     : Lia
Kelas    : 2
IPK      : 3.5
```
* Question
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!\
Answer: TampilDataSearch digunakan untuk mengoutput data dari mahasiswa yang dicari, sedangkan tampilposisi menampilkan posisi index mahasiswa yang dicari dalam array.
2. Jelaskan fungsi break pada kode program di bawah ini!\
```java
if (listMhs[i].ipk==cari) {
        pos=i;
        break;
    }
```
Answer: Untuk memastikan jika nomor yang dicari sudah ditemukan, sistem berhenti mencari.
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?\
Answer: untuk menyimpan nilai posisi atau index dari nomor yang dicari, dan juga sebagai default jika nilai tidak ditemukan.
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.\
Answer: Jika dalam array yang memiliki panjang 5 dan pada posisi 2 dan juga posisi 4 mempunyai nilai yang dicari maka nilai yang di output adalah nilai posisi 2 dan hanya posisi 2, dikarenakan algoritma search sudah diperintah untuk berhenti jika sudah menemukan nilai yang dicari.
5.  Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?\
Answer: maka algoritma search akan terus berjalan walaupun nilai yang dicari sudah ditemukan.

### 2. Searching/ Pencarian Menggunakan Algoritma Binary Search

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 7\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 7\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Masukkan Data Mahasiswa ke- 1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.6
------------------------------------------------
Masukkan Data Mahasiswa ke- 2
NIM     : 222
Nama    : Tio
Kelas   : 2
IPK     : 3.8
------------------------------------------------
Masukkan Data Mahasiswa ke- 3
NIM     : 333
Nama    : Ila
Kelas   : 2
IPK     : 3.0
------------------------------------------------
Masukkan Data Mahasiswa ke- 4
NIM     : 444
Nama    : Lia
Kelas   : 2
IPK     : 3.5
------------------------------------------------
Masukkan Data Mahasiswa ke- 5
NIM     : 555
Nama    : Fia
Kelas   : 2
IPK     : 3.3
------------------------------------------------
Mahasiswa ke-1
=============================
NIM: 111
Nama: Adi
Kelas: 2
IPK: 3.0
=============================
Mahasiswa ke-2
=============================
NIM: 222
Nama: Tio
Kelas: 2
IPK: 3.1
=============================
Mahasiswa ke-3
=============================
NIM: 333
Nama: Ila
Kelas: 2
IPK: 3.3
=============================
Mahasiswa ke-4
=============================
NIM: 444
Nama: Lia
Kelas: 2
IPK: 3.5
=============================
Mahasiswa ke-5
=============================
NIM: 555
Nama: Fia
Kelas: 2
IPK: 3.8
=============================
------------------------------------------------
Pencarian Data
------------------------------------------------
Masukkan ipk Mahasiswa yang dicari
IPK: 3.8
-------------------------
Menggunakan binary search
-------------------------
Data mahasiswa dengan IPK: 3.3 Ditemukan pada indeks 4
NIM      : 555
Nama     : Fia
Kelas    : 2
IPK      : 3.8
```
* Question
1. Tunjukkan pada kode program yang mana proses divide dijalankan!\
Answer: 
```java
} else if (listMhs[mid].ipk>cari) {
         return finBinarySearch(cari, left, mid-1);
    } else {
        return finBinarySearch(cari, mid+1, right);
    }
```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
Answer:
```java
if (cari == listMhs[mid].ipk) {
        return mid;
    }
```
3. Apa fungsi left, right, dan mid?\
Answer: Left dan Right berguna untuk membagi array menjadi dua bagian, sedangkan mid dipakai utuk mencari nilai yang dicari dan juga batas pembagi untuk array.
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?\
Answer: bisa saja nilai yang seharusnya ada dalam array tidak dapat ditemukan.
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai\
Answer: Nilai yang dicari bisa saja tidak ditemukan, agar bisa digunakan kode program harus diubah seperti berikut
```java
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
```
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array\
Answer: Sebelum mencari nilai tengah, alogritma ini melihat jika nilai right lebih besar dari left jika true maka algoritma melanjutkan kode programnya, tetapi jika false maka nilai yang dicari tidak ditemukan.
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.\
Answer: 
```java
//Pada Fungsi Main
MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();
        Scanner Rian = new Scanner(System.in);
        int jumMhs = Rian.nextInt();
        list.jmlMahasiswa(jumMhs);
//Pada Class MahasiswaBerprestasi01.java
Mahasiswa01[] listMhs;
    
void jmlMahasiswa(int jm){
    listMhs = new Mahasiswa01[jm];
}
```


## Authors
Adrian Alexander Sanda.
