# REPORT

Answer on jobsheet 16.

## Description

My answer on jobsheet 16.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1.  Kegiatan Praktikum 1

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 14\src\ContohList.java'
```
Or
```bash
cd '.\Pertemuan 14\src\'
java ContohList.java
```
* Output
``` shell
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```
* Question
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?\

Answer: Dikarenakan arraylist yang dibuat tidak menggunakan Generics yang mengakibatkan arraylist mengambil tipe data defauklt yaitu Object. Karena semua tipe data di java merupakan turunan dari Object, maka array list bisa menampung tipe data apapun.

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!\

Answer: Hanya perlu denga modifikasi instansiasi arraylist nya untuk memiliki Generics
```java
List<Integer> l = new ArrayList<>();
``` 

3. Ubah kode pada baris kode 38 menjadi seperti ini\
```java
LinkedList<String> names = new LinkedList<>();
```

Answer: Sekrang linked list hanya dapat menampung nilai ber tipe data String.

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
```java
names.push("Mei-mei");

System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
        names.getFirst(), names.size(), names.getLast());
System.out.println("Names: " + names.toString());
```
Answer:

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!\

Answer: push("Mei-mei") pada LinkedList beroperasi menggunakan konsep Stack Fungsi method ini adalah menyisipkan elemen baru persis pada posisi paling awal atau head (indeks ke-0) dari LinkedList, bukan di posisi akhir.

### 2.  Kegiatan Praktikum 2

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 14\src\LoopCollection'
```
Or
```bash
cd '.\Pertemuan 14\src\'
java LoopCollection.java
```
* Output
``` shell
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
```
* Question
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?\

Answer: push() adalah method spesifik class stack, sedangkan add adalah method bawaan dari collection / list yang diwariskan ke stack.

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?\

Answer: ika baris 43 dan 44 (fruits.push("Melon"); dan fruits.push("Durian");) dihilangkan, maka output pada perulangan Iterator, Stream, maupun for loop di bawahnya tidak akan menampilkan teks apa pun.

3. Jelaskan fungsi dari baris 46-49?\

Answer: Kode tersebut berfungsi untuk melakukan traversal dalam collection fruits. Dengna mengambil elemen baru menggunakan next(); lalu mencetaknya.

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?\

Answer: Akan terjadinya error kompilasi dikarenakna menggunakan metode spesifik stack.

5. Ganti elemen terakhir dari objek fruits menjadi "Strawberry"!\

Answer: Bisa menggunakan set() untuk mereplace elemen terakhir dengan strawberry.

6. Tambahkan 3 buah seperti "Mango", "guava", dan "avocado" kemudian dilakukan sorting!\

Answer: Untuk menambahkan dan mengurutkan bisa dilakukan seperti ini.
```java
fruits.push("Mango");
fruits.push("guava");
fruits.push("avocado");

java.util.Collections.sort(fruits);

System.out.println(fruits.toString());
```

### 3.  Kegiatan Praktikum 3

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 14\src\ListMahasiswa.java'
```
Or
```bash
cd '.\Pertemuan 14\src\'
java ListMahasiswa.java
```
* Output
``` shell
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}
```
* Question
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?\

Answer: Menggunakan variabel argumen yang mempunyai kelebihan yaitu, dapat memberikan fleksibilitas saat memanggil method dikarenakan bisa mengirim argumen dengan jumlah yang dinamis.

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!\

Answer: 
```java
public int binarySearch(String nim) {
        sortAscending();
        
        Mahasiswa searchKey = new Mahasiswa(nim, "", "");
        
        return Collections.binarySearch(mahasiswas, searchKey, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }
```

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!\

Answer: 
```java
public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }
```

### 4.  Tugas 1

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 14\src\SistemNilaiMain.java'
```
Or
```bash
cd '.\Pertemuan 14\src\'
java SistemNilaiMain.java
```
* Output
``` shell
*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 1

Masukkan data
Kode    : 123
Nilai   : 32

DAFTAR MAHASISWA
*************************************************
NIM        Nama                 Telf           
20001      Thalhah              021xxx         
20002      Zubair               021xxx         
20003      Abdur-Rahman         021xxx         
20004      Sa'ad                021xxx         
20005      Sa'id                021xxx         
20006      Ubaidah              021xxx         
Pilih mahasiswa by nim: 20001

DAFTAR MATA KULIAH
*************************************************
Kode       Mata Kuliah                              SKS  
00001      Internet of Things                       3    
00002      Algoritma dan Struktur Data              2    
00003      Algoritma dan Pemrograman                2    
00004      Praktikum Algoritma dan Struktur Data    3    
00005      Praktikum Algoritma dan Pemrograman      3    
Pilih MK by kode: 00001
Data nilai berhasil disimpan!

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 2

DAFTAR NILAI MAHASISWA
*************************************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai
20001      Thalhah         Internet of Things                       3     32.00
*************************************************************************

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 3

DAFTAR NILAI MAHASISWA
*************************************************************************
Masukkan data mahasiswa [nim] : 20001
Nim        Nama            Mata Kuliah                              SKS   Nilai
20001      Thalhah         Internet of Things                       3     32.00
Total SKS 3 telah diambil.
*************************************************************************

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 4

DAFTAR NILAI MAHASISWA
*************************************************************************
Nim        Nama            Mata Kuliah                              Nilai SKS  
20001      Thalhah         Internet of Things                       32.00 3    
*************************************************************************

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 5

Data mahasiswa Thalhah (NIM: 20001) berhasil dihapus dari antrean.

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Data Mahasiswa (Queue)
6. Keluar
*************************************************
Pilih   : 6

Terima kasih.
```

* Question
1. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1!\

Answer: 
```java
public static void hapusMahasiswa() {
        if (!daftarMahasiswa.isEmpty()) {
            Mahasiswa mhsDihapus = daftarMahasiswa.poll();
            System.out.println("Data mahasiswa " + mhsDihapus.nama + " (NIM: " + mhsDihapus.nim + ") berhasil dihapus dari antrean.");
            
            daftarNilai.removeIf(n -> n.mhs.nim.equals(mhsDihapus.nim));
        } else {
            System.out.println("Antrean mahasiswa sudah kosong!");
        }
    }
```

## Authors
Adrian Alexander Sanda.
