# REPORT

Answer on jobsheet 5.

## Description

My answer on jobsheet 5.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1. Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 5\src\MainFaktorial.java'
```
Or
```bash
cd '.\Pertemuan 5\src\'
java MainFaktorial.java
```
* Output
``` shell
Masukkan nilai 8
Niali faktorial 8 menggunakan BF: 40320
Niali faktorial 8 menggunakan DC: 40320
```
* Question
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!\
Answer: If disini digunakan sebagai base case yang dipakai sebagai batas akhir suatu rekursif, sedangkan else digunakan untuk mengekspansi data. Ekspansi data yang dilakukan oleh else haruse mendekati pada base case if.
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!\
Answer: Bisa diganti menggunakan while ataupun looping lainnya
```java
while (i <= n) {
            fakto *= i;
            i++;
        }
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !\
Answer: "fakto *= i" digunakan pada pendekatan brute force, line ini mengambil nilai dari i dan dikalikan dengan fakto, dan hasilnya disimpan ke dalam fakto. "int fakto = n * faktorialDC(n-1);" digunakan pada pendekata divide conquer, line ini menambil nilai n dan dikalikan dengan methode yang sama dengan nilai paramater dikurangi 1.

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!\
Answer: faktorialBF, menggunakan perulangan untuk mencari hasilnya, sedangkan faktorialDC, menggunakan recursive untuk mencari hasilnya.

### 2. Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 5\src\MainPangkat.java'
```
Or
```bash
cd '.\Pertemuan 5\src\'
java MainPangkat.java
```
* Output
``` shell
Masukkan Jumlah elemen: 3
Masukkan nilai basis elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
Masukkan nilai basis elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
Masukkan nilai basis elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
Hasil Pangkat BF
2^3: 8
4^5: 1024
6^7: 279936
Hasil Pangkat DC
2^3: 8
4^5: 1024
6^7: 279936
```
* Question
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!\
Answer: pangkatBF() menggunakan perulangan untuk mencari hasilnya, sedangkan pangkatDC() menggunakan recursive untuk membagikan pangkat menjadi pangkat yang lebih kecil lalu dikalikan.
2.  Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!\
Answer: Ya, jumlah pangkat akan diporong terus menjadi lebih kecil hingga pangkatnya menjadi n=1, dan akan mengemablikan nilai basis, setelah pankat n=1 tercapai maka akan memulai tahap combine dengan mengembalikan nilai-nilai basis dan menggabungkannya.
```java
 if (n==1) {
            return a;
        } else {
            if (n%2==1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            } else {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
```
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?\
Answer: method tersebut bisa tetap di pakai tanpa parameter dengan mengubah sedikit hal, disini saya akan membuat ulang methodnya tanpa menggunakan parameter.
```java
int pangkatBF(){
        int hasil = 1;
        for (int i = 0; i < nilai; i++) {
            hasil *= pangkat;
        }
        return hasil;
    }
``` 
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!\
Answer: pangkatBF() menggunakan perulangan untuk menghitung pangkat, "n*n*n*n*....*n", sedangkan pangkatDC() menggunakan recursive untuk membagikan pangkat yang besar menjadi 2 pangkat yang lebih kecil, hingga pangkat menjadi 1 lalu menggembalikan nilai basis dan menggabungkannya dari semua bagian kecil.

### 3. Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 5\src\MainSum.java'
```
Or
```bash
cd '.\Pertemuan 5\src\'
java MainSum.java
```
* Output
``` shell
Masukkan jumlah elemen: 5
Masukkan keuntungan ke-1: 12
Masukkan keuntungan ke-2: 32
Masukkan keuntungan ke-3: 43
Masukkan keuntungan ke-4: 44
Masukkan keuntungan ke-5: 55
Total Keuntungan menggunakan BF: 186.0
Total Keuntungan menggunakan DC: 186.0
```
* Question
1. Kenapa dibutuhkan variable mid pada method TotalDC()?\
Answer: Untuk membagi data array menjadi 2.
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
```java
double lsum=totalDC(arr, i, mid);
double rsum=totalDC(arr, mid+1, r);
```
Answer: Berguna untuk membagikan data array menjadi dua lsum menghitung sum dari bagian kiri array, dan rsum untuk bagian kanan array.
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
```java
return lsum+rsum;
```
Answer: untuk menggabingkan hasil dari sum bagian kiri dan kanan untuk mendapatkan total dari sum.
4. Apakah base case dari totalDC()?\
Anwer: base case adalah pangkasan kode ini, yaitu jika int i (index Array paling awal) sama dengan int r (index array paling akhir)
```java
 if (i==r) {
            return arr[i];
        }
```
5. Tarik Kesimpulan tentang cara kerja totalDC()\
Answer: array di bagi-bagi menjadi dua bagian, dan dua bagian tersebut dibagi lagi sampai nomor index paling awal dan akhir bernilai sama. Nilai dari array pada index tersebut dikembalikan lalu digabung dengan nilai yang lain.

### 4. Tugas 1

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 5\src\MainUts.java'
```
Or
```bash
cd '.\Pertemuan 5\src\'
java MainUts.java
```
* Output
``` shell
Nilai Uts tertinggi adalah 92
Nilai Uts terendah adalah 76
Rata-Rata nilai Uas adalah 85.0
```

## Authors
Adrian Alexander Sanda.
