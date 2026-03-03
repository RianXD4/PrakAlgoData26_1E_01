# REPORT

Answer on jobsheet 3.

## Description

My answer on jobsheet 3.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Membuat Array dari Object, Mengisi dan Menampilkan

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 3\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 3\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
NIM     : 244107060033
NAMA    : AGNES TITANIA KINANTI
KELAS   : SIB-IE
IPK     : 3.75
-------------------------------------------------
NIM     : 2341720172
NAMA    : ACHMAD MAULANA HAMZAH
KELAS   : TI-2A
IPK     : 3.36
-------------------------------------------------
NIM     : 244107023006
NAMA    : DIRHAMAWAN PUTRANTO
KELAS   : TI-2E
IPK     : 3.8
-------------------------------------------------
```
* Question
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!\
Answer: Bisa, pada contoh diatas kita bisa lihat bahwa class Mahasiswa01 hanya memiliki atribut dan tidak memiliki method. Class Mahasiswa tetap masih bisa dimasukkan ke dalam arraayofMahasiswa.
2. Apa yang dilakukan oleh kode program berikut?
```bash
Mahasiswa01[] arraayofMahasiswa = new Mahasiswa01[3];
```
Answer: kode program tersebut berguna untuk membuat array yang bertipe data Mahasiswa01(class). Hal ini berguna agar dapat memasukkan object kedalam array.
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
```bash
arraayofMahasiswa[0] = new Mahasiswa01();
```
Answer: Ya, pemanggilan konstruktor adalah pemanggilan konstruktor default yang tidak menggunakan parameter apapun.
4. Apa yang dilakukan oleh kode program berikut?
```bash
        arraayofMahasiswa[0] = new Mahasiswa01();
        arraayofMahasiswa[0].nim = "244107060033";
        arraayofMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arraayofMahasiswa[0].kelas = "SIB-IE";
        arraayofMahasiswa[0].ipk = 3.75f;
```
Answer: line pertama berguna untuk membuat object dalam array tersebut, line kedua dst, berguna untuk menaruh nilai kedalam atribut object yang ada dalam array.
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?\
Answer: Memisahkan file Mahasiswa dan file MahasiswaDemo dapat membantu dalam mengedit dan membaca kode.

### 2.  Menerima Input Isian Array Menggunakan Looping

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 3\src\MahasiswaDemo01.java'
```
Or
```bash
cd '.\Pertemuan 3\src\'
java MahasiswaDemo01.java
```
* Output
``` shell
Masukkan Data Mahasiswa ke-1
NIM     :244107060033
Nama    :AGNES TITANIA KINANTI
Kelas   :SIB-IE
IPK     :3.75
------------------------------------------------
Masukkan Data Mahasiswa ke-2
NIM     :2341720172
Nama    :ACHMAD MAULANA HAMZAH
Kelas   :TI-2A
IPK     :3.36
------------------------------------------------
Masukkan Data Mahasiswa ke-3
NIM     :244107023006
Nama    :DIRHAMAWAN PUTRANTO
Kelas   :TI-2E
IPK     :3.8
------------------------------------------------
NIM     : 244107060033
NAMA    : AGNES TITANIA KINANTI
KELAS   : SIB-IE
IPK     : 3.75
------------------------------------------------
NIM     : 2341720172
NAMA    : ACHMAD MAULANA HAMZAH
KELAS   : TI-2A
IPK     : 3.36
------------------------------------------------
NIM     : 244107023006
NAMA    : DIRHAMAWAN PUTRANTO
KELAS   : TI-2E
IPK     : 3.8
------------------------------------------------
```
* Question
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.\
Answer: Pada class Mahasiswa ditambahkan
``` java
void cetakinfo( ){
            System.out.println("NIM\t: "+nim);
            System.out.println("NAMA\t: "+nama);
            System.out.println("KELAS\t: "+kelas);
            System.out.println("IPK\t: "+ipk);
            System.out.println("------------------------------------------------");

    }
```
Pada MahasiswaDemo dari
```java
for (int i = 0; i < arraayofMahasiswa.length; i++) {
            System.out.println("NIM\t: "+arraayofMahasiswa[i].nim);
            System.out.println("NAMA\t: "+arraayofMahasiswa[i].nama);
            System.out.println("KELAS\t: "+arraayofMahasiswa[i].kelas);
            System.out.println("IPK\t: "+arraayofMahasiswa[i].ipk);
            System.out.println("------------------------------------------------");

        }
```
Menjadi
```java
        for (int i = 0; i < arraayofMahasiswa.length; i++) {
            arraayofMahasiswa[i].cetakinfo();
        }
```

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
```java
 Mahasiswa01[] myArrayOfMahasiswa = new Mahasiswa01[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama= "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-IE";
        myArrayOfMahasiswa[0].ipk = 3.75f;
```
Answer: Error terjadi karena object dalam myArrayOfMahasiswa[0] belum diinialisasikan mennyebabkan error saat ingin menaruh nila kedalam atribut object pada array tersebut.

### 3.  Constructor Berparameter

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 3\src\MatakuliahDemo01.java'
```
Or
```bash
cd '.\Pertemuan 3\src\'
java MatakuliahDemo01.java
```
* Output
``` shell
Masukkan data Matakuliah ke-1
Kode    : 12345
Nama    : Algoritma & Struktur Data
Sks     : 2
Jumlah Jam      : 6
--------------------------------------------------
Masukkan data Matakuliah ke-2
Kode    : 54321
Nama    : Sistem Basis Data
Sks     : 2
Jumlah Jam      : 4
--------------------------------------------------
Masukkan data Matakuliah ke-3
Kode    : 83652
Nama    : Dasar Pemrograman
Sks     : 2
Jumlah Jam      : 4
--------------------------------------------------
Data Matakuliah Ke-1
Kode    : 12345
Nama    : Algoritma & Struktur Data
Sks     : 2
Jumlah Jam      : 6
--------------------------------------------------
Data Matakuliah Ke-2
Kode    : 54321
Nama    : Sistem Basis Data
Sks     : 2
Jumlah Jam      : 4
--------------------------------------------------
Data Matakuliah Ke-3
Kode    : 83652
Nama    : Dasar Pemrograman
Sks     : 2
Jumlah Jam      : 4
--------------------------------------------------
```
* Question
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya\
Answer: Ya, pada percobaan ini Matakuliah mempunyai lebih dari satu konstruktor.
```java
public Matakuliah01(String k, String n, int s, int jJ){ //Konstruktor Matakuliah Berparameter
        this.kode = k;
        this.nama = n;
        this.sks = s;
        this.jumlahJam = jJ;
    }
public Matakuliah01(){ //Konstruktor Matakuliah Default

    }

```
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah\
Answer: Pada Class Matakuliah
```java
public Matakuliah01(){

    }

    void tambahData() {
        String dummy;
        Scanner Rian = new Scanner(System.in);
        System.out.print("Kode\t: ");
        kode = Rian.nextLine();
        System.out.print("Nama\t: ");
        nama = Rian.nextLine();
        System.out.print("Sks\t: ");
        dummy = Rian.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam\t: ");
        dummy = Rian.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("--------------------------------------------------");
    }
```
Pada Main
```java
for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data Matakuliah ke-"+(i+1));
            arrayOfMatakuliah[i] = new Matakuliah01();
            arrayOfMatakuliah[i].tambahData();
        }
```
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar\
Answer: Pada Class Matakuliah
```java
void cetakInfo(){
            System.out.println("Kode\t: "+kode);
            System.out.println("Nama\t: "+nama);
            System.out.println("Sks\t: "+sks);
            System.out.println("Jumlah Jam\t: "+jumlahJam);
            System.out.println("--------------------------------------------------");
    }
```
Pada Main
```java
 for (int i = 0; i < arrayOfMatakuliah.length; i++) {
        System.out.println("Data Matakuliah Ke-"+(i+1));
        arrayOfMatakuliah[i].cetakInfo();
        }
```
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner\
Answer: pada Main
```java
         System.out.print("Jumlah Matakuliah: ");
        int n = Rian.nextInt();
        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[n];
```

### 4.  Tugas No.1

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 3\src\DosenDemo01.java'
```
Or
```bash
cd '.\Pertemuan 3\src\'
java DosenDemo01.java
```
* Output
``` shell
Jumlah Dosen: 2
Input Data Dosen ke-1
Kode    : 12345
Nama    : Nobberu
Jenis Kelamin(L/P)      : L
Usia    : 43
--------------------------------------------------------
Input Data Dosen ke-2
Kode    : 54321
Nama    : urebboN
Jenis Kelamin(L/P)      : P
Usia    : 34
--------------------------------------------------------
        Data Dosen
Kode    : 12345
Nama    : Nobberu
Jenis Kelamin   : Laki-Laki
Usia    : 43
--------------------------------------------------------
        Data Dosen
Kode    : 54321
Nama    : urebboN
Jenis Kelamin   : Perempuan
Usia    : 34
--------------------------------------------------------
```

### 5.  Tugas No.2

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 3\src\DosenDemo01.java'
```
Or
```bash
cd '.\Pertemuan 3\src\'
java DosenDemo01.java
```
* Output
``` shell
Jumlah Dosen: 5
Input Data Dosen ke-1
Kode    : 12345
Nama    : Adren
Jenis Kelamin(L/P)      : L
Usia    : 53
--------------------------------------------------------
Input Data Dosen ke-2
Kode    : 54321
Nama    : Nedra
Jenis Kelamin(L/P)      : P
Usia    : 35
--------------------------------------------------------
Input Data Dosen ke-3
Kode    : 67890
Nama    : Nora
Jenis Kelamin(L/P)      : L
Usia    : 28
--------------------------------------------------------
Input Data Dosen ke-4
Kode    : 09876
Nama    : Aron
Jenis Kelamin(L/P)      : P
Usia    : 32
--------------------------------------------------------
Input Data Dosen ke-5
Kode    : 45678
Nama    : Dian
Jenis Kelamin(L/P)      : P
Usia    : 21
--------------------------------------------------------
        Data Dosen
Kode    : 12345
Nama    : Adren
Jenis Kelamin   : Laki-Laki
Usia    : 53
--------------------------------------------------------
        Data Dosen
Kode    : 54321
Nama    : Nedra
Jenis Kelamin   : Perempuan
Usia    : 35
--------------------------------------------------------
        Data Dosen
Kode    : 67890
Nama    : Nora
Jenis Kelamin   : Laki-Laki
Usia    : 28
--------------------------------------------------------
        Data Dosen
Kode    : 09876
Nama    : Aron
Jenis Kelamin   : Perempuan
Usia    : 32
--------------------------------------------------------
        Data Dosen
Kode    : 45678
Nama    : Dian
Jenis Kelamin   : Perempuan
Usia    : 21
--------------------------------------------------------
DOSEN TERMUDA
        Data Dosen
Kode    : 45678
Nama    : Dian
Jenis Kelamin   : Perempuan
Usia    : 21
--------------------------------------------------------
DOSEN TERTUA
        Data Dosen
Kode    : 12345
Nama    : Adren
Jenis Kelamin   : Laki-Laki
Usia    : 53
--------------------------------------------------------
Jumlah Dosen Laki Laki adalah 2
Jumlah Dosen Perempuan adalah 3
Rata-rata Usia Dosen Laki-Laki adalah 40
Rata-rata Usia Dosen Perempuan adalah 29
```
## Authors
Adrian Alexander Sanda.
