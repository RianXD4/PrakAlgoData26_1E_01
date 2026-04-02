# REPORT

Answer on jobsheet 6.

## Description

My answer on jobsheet 6.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Mengimplementasikan Sorting menggunakan object

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 6\src\SortinMain01.java'
```
Or
```bash
cd '.\Pertemuan 6\src\'
java SortinMain01.java
```
* Output
``` shell
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 

Data awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30 

Data awal 3
40 10 4 9 3 
Data sudah diurutkan dengan INSETION SORT (ASC)
3 4 9 10 40 

```
* Question
1. Jelaskan fungsi kode program berikut
```java
if (data[j-1]>data[j]) {
    temp = data[j];
    data[j]=data[j-1];
    data[j-1]=temp;
}
```
Answer: Jika dalam kondisi dimana nilai Data[j-1] (satu index sebelum data[j]) lebih besar daripada data[j] maka temp akan menyimpan nilai data[j] dan nilai data[j] akan ditimpa dengan data[j-1], lalu data[j-1] menarik nilai dari temp.

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!\
Answer: Kode Programn algoritma pencarian nilai minimum adalah
```java
for (int j = i+1; j < jumData; j++) {
    if (data[j]<data[min]) {
    min=j;
}
```
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan 
```java
 while (j>=0 && data[j]>temp)
```
Answer: Selama nilai j sama atau lebih dari 0 dan data[j] lebih besar daripada nilai pada temp, maka perulangan ini akan terus berjalan.
4. Pada Insertion sort, apakah tujuan dari perintah
```java
data[j+1]=data[j];
```
Answer: Kode ini berguna untuk memindahkan data[j+1] pada index j dalam array.

### 2. Sorting Menggunakan Array of Object

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 6\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 6\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
---------------------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
---------------------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
---------------------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
---------------------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
---------------------------------------
Data mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
---------------------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
---------------------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
---------------------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
---------------------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
---------------------------------------
```
* Question
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```java
for (int i = 0; i < listMhs.length-1; i++) {
    for (int j = 1; j < listMhs.length; j++)
```
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?\
Answer: Syarat tersebut berguna untuk menjalankan setiap tahap bubblesort.\
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?\
Answer: Syarat tersebut berguna untuk setiap perpindahan yang terjadi pada bubblesort\
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh ?\
Answer: Perulangan i sebanyak 49, dan tahap bubble sort yang ditempuh sebanyak 49+48+47+....1 = 1225 kali.\
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!\
Answer: 
```java
Mahasiswa01[] arr = new Mahasiswa01[list.listMhs.length];
    Scanner Rian = new Scanner(System.in);
    for (int i = 1; i <= list.listMhs.length; i++) {
        System.out.println("Masukan Data Mahasiswa Ke-"+i);
        System.out.print("Nama: ");
        String nama = Rian.nextLine();
        System.out.print("NIM: ");
        String nim = Rian.nextLine();
        System.out.print("Kelas: ");
        String kls = Rian.nextLine();
        System.out.print("IPK: ");
        Double ipk = Rian.nextDouble();
        arr[i-1] = new Mahasiswa01(nim, nama, kls, ipk);
    }
    for (int i = 0; i < arr.length; i++) {
        list.tambah(arr[0]);
    }
```
### 3. Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 6\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 6\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Masukan Data Mahasiswa Ke-1
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
Masukan Data Mahasiswa Ke-2
Nama: Ila
NIM: 124
Kelas: 2B
IPK: 3.1
Masukan Data Mahasiswa Ke-3
Nama: Agus
NIM: 125
Kelas: 2B
IPK: 3.6
Masukan Data Mahasiswa Ke-4
Nama: Tika
NIM: 126
Kelas: 2B
IPK: 3.3
Masukan Data Mahasiswa Ke-5
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
Data mahasiswa setelah sorting menggunakan SELECTION SORT (ASC)
Nama: Ila
NIM: 124
Kelas: 2B
IPK: 3.1
---------------------------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
---------------------------------------
Nama: Tika
NIM: 126
Kelas: 2B
IPK: 3.3
---------------------------------------
Nama: Agus
NIM: 125
Kelas: 2B
IPK: 3.6
---------------------------------------
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
---------------------------------------
```
* Question
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```java
int idxMin=i;
for (int j = i+1; j < listMhs.length; j++) {
    if (listMhs[j].ipk<listMhs[idxMin].ipk) {
        idxMin=j;
    }
}
```
Untuk apakah proses tersebut, jelaskan!\
Answer: Potongan kode ini berguna untuk mencari index dari nilai IPK paling terkecil dalam array tersebut. 

### 4. Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 6\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 6\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Masukan Data Mahasiswa Ke-1
Nama: Ayu
NIM: 111
Kelas: 2C
IPK: 3.7
Masukan Data Mahasiswa Ke-2
Nama: Dika
NIM: 222
Kelas: 2C
IPK: 3.0
Masukan Data Mahasiswa Ke-3
Nama: Ila
NIM: 333
Kelas: 2C
IPK: 3.8
Masukan Data Mahasiswa Ke-4
Nama: Susi
NIM: 444
Kelas: 2C
IPK: 3.1
Masukan Data Mahasiswa Ke-5
Nama: Yayuk
NIM: 555
Kelas: 2C
IPK: 3.4
Data mahasiswa setelah sorting menggunakan INSERTION SORT (ASC)
Nama: Dika
NIM: 222
Kelas: 2C
IPK: 3.0
---------------------------------------
Nama: Susi
NIM: 444
Kelas: 2C
IPK: 3.1
---------------------------------------
Nama: Yayuk
NIM: 555
Kelas: 2C
IPK: 3.4
---------------------------------------
Nama: Ayu
NIM: 111
Kelas: 2C
IPK: 3.7
---------------------------------------
Nama: Ila
NIM: 333
Kelas: 2C
IPK: 3.8
---------------------------------------
```
* Question
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.\
Answer: 
```java
void insertionSort(){
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa01 temp = listMhs[i];
        int j=i;
        while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
            listMhs[j] = listMhs[j-1];
            j--;
        }
        listMhs[j] = temp;
    }
}
```
### 5. Latihan Praktikum.
* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 6\src\DosenDemo01.java.java'
```
Or
```bash
cd '.\Pertemuan 6\src\'
java DosenDemo01.java
```
* Output
``` shell
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 1
Data Dosen Ke-1
Kode: 138
Nama: Budi
Jenis Kelamin (L/P): L
Usia: 34
Data Dosen Ke-2
Kode: 247
Nama: Siti
Jenis Kelamin (L/P): P
Usia: 57
Data Dosen Ke-3
Kode: 581
Nama: Ahmad
Jenis Kelamin (L/P): L
Usia: 29
Data Dosen Ke-4
Kode: 104
Nama: Dewi
Jenis Kelamin (L/P): P
Usia: 42
Data Dosen Ke-5
Kode: 892
Nama: Fajar
Jenis Kelamin (L/P): L
Usia: 38
Data Dosen Ke-6
Kode: 365
Nama: Putri
Jenis Kelamin (L/P): P
Usia: 51
Data Dosen Ke-7
Kode: 713
Nama: Andi
Jenis Kelamin (L/P): L
Usia: 26
Data Dosen Ke-8
Kode: 429
Nama: Sari
Jenis Kelamin (L/P): P
Usia: 48
Data Dosen Ke-9
Kode: 650
Nama: Rian
Jenis Kelamin (L/P): L
Usia: 31
Data Dosen Ke-10
Kode: 976
Nama: Linda
Jenis Kelamin (L/P): P
Usia: 55
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 3
Sort
---------------------------------
1. Bubble Sort (ASC)
2. Selection Sort (DSC)
3. Insertion Sort (DSC)
---------------------------------
ANS: 1
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 2
Kode: 713
Nama: Andi
JenisKelamin: Laki-Laki
Usia: 26
-------------------------------------
Kode: 581
Nama: Ahmad
JenisKelamin: Laki-Laki
Usia: 29
-------------------------------------
Kode: 650
Nama: Rian
JenisKelamin: Laki-Laki
Usia: 31
-------------------------------------
Kode: 138
Nama: Budi
JenisKelamin: Laki-Laki
Usia: 34
-------------------------------------
Kode: 892
Nama: Fajar
JenisKelamin: Laki-Laki
Usia: 38
-------------------------------------
Kode: 104
Nama: Dewi
JenisKelamin: Perempuan
Usia: 42
-------------------------------------
Kode: 429
Nama: Sari
JenisKelamin: Perempuan
Usia: 48
-------------------------------------
Kode: 365
Nama: Putri
JenisKelamin: Perempuan
Usia: 51
-------------------------------------
Kode: 976
Nama: Linda
JenisKelamin: Perempuan
Usia: 55
-------------------------------------
Kode: 247
Nama: Siti
JenisKelamin: Perempuan
Usia: 57
-------------------------------------
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 3
Sort
---------------------------------
1. Bubble Sort (ASC)
2. Selection Sort (DSC)
3. Insertion Sort (DSC)
---------------------------------
ANS: 2
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 2
Kode: 247
Nama: Siti
JenisKelamin: Perempuan
Usia: 57
-------------------------------------
Kode: 976
Nama: Linda
JenisKelamin: Perempuan
Usia: 55
-------------------------------------
Kode: 365
Nama: Putri
JenisKelamin: Perempuan
Usia: 51
-------------------------------------
Kode: 429
Nama: Sari
JenisKelamin: Perempuan
Usia: 48
-------------------------------------
Kode: 104
Nama: Dewi
JenisKelamin: Perempuan
Usia: 42
-------------------------------------
Kode: 892
Nama: Fajar
JenisKelamin: Laki-Laki
Usia: 38
-------------------------------------
Kode: 138
Nama: Budi
JenisKelamin: Laki-Laki
Usia: 34
-------------------------------------
Kode: 650
Nama: Rian
JenisKelamin: Laki-Laki
Usia: 31
-------------------------------------
Kode: 581
Nama: Ahmad
JenisKelamin: Laki-Laki
Usia: 29
-------------------------------------
Kode: 713
Nama: Andi
JenisKelamin: Laki-Laki
Usia: 26
-------------------------------------
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 3
Sort
---------------------------------
1. Bubble Sort (ASC)
2. Selection Sort (DSC)
3. Insertion Sort (DSC)
---------------------------------
ANS: 3
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 2
Kode: 247
Nama: Siti
JenisKelamin: Perempuan
Usia: 57
-------------------------------------
Kode: 976
Nama: Linda
JenisKelamin: Perempuan
Usia: 55
-------------------------------------
Kode: 365
Nama: Putri
JenisKelamin: Perempuan
Usia: 51
-------------------------------------
Kode: 429
Nama: Sari
JenisKelamin: Perempuan
Usia: 48
-------------------------------------
Kode: 104
Nama: Dewi
JenisKelamin: Perempuan
Usia: 42
-------------------------------------
Kode: 892
Nama: Fajar
JenisKelamin: Laki-Laki
Usia: 38
-------------------------------------
Kode: 138
Nama: Budi
JenisKelamin: Laki-Laki
Usia: 34
-------------------------------------
Kode: 650
Nama: Rian
JenisKelamin: Laki-Laki
Usia: 31
-------------------------------------
Kode: 581
Nama: Ahmad
JenisKelamin: Laki-Laki
Usia: 29
-------------------------------------
Kode: 713
Nama: Andi
JenisKelamin: Laki-Laki
Usia: 26
-------------------------------------
Main Menu
---------------------------------
1. Tambah Data
2. Tampil Data
3. Sort
4. Quit
---------------------------------
ANS: 4

```
## Authors
Adrian Alexander Sanda.
