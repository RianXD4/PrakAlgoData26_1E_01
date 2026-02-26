# REPORT

Answer on jobsheet 2.

## Description

My answer on jobsheet 2.
From Deklarasi Class to Tugas 2.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Deklarasi Class, Atribut dan Method

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
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?



## Authors
Adrian Alexander Sanda.
