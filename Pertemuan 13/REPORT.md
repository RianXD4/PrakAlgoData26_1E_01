# REPORT

Answer on jobsheet 12.

## Description

My answer on jobsheet 12.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1.  Implementasi Binary Search Tree menggunakan Linked List

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 13\src\BinaryTreeMain01.java'
```
Or
```bash
cd '.\Pertemuan 13\src\'
java BinaryTreeMain01.java
```
* Output
``` shell
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22: Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
```
* Question
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?\

Answer: Karena penataan nilai data yang ada dalam binari tree sudah diatur. setiap node bisa memiliki 2 anak kiri dan kanan. Untuk anak yang diposisikan di kiri nilainya lebih kecil dari parent nya sedangkan anak yang diposisikan di kanan nilainya lebih besar dari parent nya. Karena hal tersebut binary search akan jauh lebih optimal untuk dipakai karena tidak perlu adanya tambahan sort nilai.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?\

Answer: sebagai penghubung satu node dengan node yang lain dengan node kiri mempunyai nilai yang lebih kecil dari parentnya dan node kanan mempunyai nilai yang lebih besar dari parentnya.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?\
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?\

Answer: \
a. root sebagai pointer awal dari data, dan merupakan dasar dari semua data yang ada pada binary tree.\
b. Karena objek tree baru dibuat dan belum diisi file sama sekali maka nilai dari root masih null.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?\

Answer: Maka node baru tersebut akan menjadi nilai root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
```java
    parent = current;
    if (mahasiswa.ipk < current.mahasiswa.ipk) {
        current = current.left;
        if (current == null) {
            parent.left = newNode;
            return;
        }
    } else {
        current = current.right;
        if (current == null) {
            parent.right = newNode;
            return;
        }
    }
```
Answer: pointer parent mengambil node current lalu mengecek nilai ipk mahasiswa yang ingin ditambahkan lebih kecil atau lebih besar dari nilai ipk current. jika nilai Ipk mahasiswa yang ingin ditambahkan lebih kecil dari nilai ipk mahasiswa current maka, nilai Mahasiswa yang ingin ditambahkan menjadi nilai untuk parent.left. Jika nilai ipk mahasiswa yang ingin ditambahkan lebih besar dari nilai ipk mahasiswa current maka, nilai Mahasiswa yang ingin ditambahkan menjadi nilai untuk parent.right.

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?\

Answer: Pertama mengecek binary tree kosong atau tidak. lalu kita buat 2 pointer yaitu parent dan current, lalu beri nilai root untuk keduanya dan juga Boolean isLeftChild dengan nilai false. lalu dilakukan perulangan jika ipk current sama dengan ipk target yang ingin dihapus, maka perulangan akan dihentikan. Jika ipk current lebih kecil dari ipk target maka parent mengambil nilai dari current, dan current mengambil nilai dari current.left dan status isLeftChild menjadi true. Jika ipk current lebih besar dari ipk target maka parent mengambil nilai dari current, dan current mengambil nilai dari current.right dan status isLeftChild menjadi false. Dilakukan pengecekan jika nilai current sama dengan null maka tampilkan data tidak ditemukan. Sekarangn mengecek jika target yang dihapus mempunyai anak atau tidak. Jika tidak mempunyai anak, melakukan pengecekan status isLeftChild. Jika benar maka parent.left menjadi null, jika false maka parent.right menjadi null. Jika target mempunyai 1 anak, maka anak dari target tersebut akan disambungkan ke parent. Jika status isLeftChild benar maka anak dari target akan disambungkan ke parent.left, Jika salah maka anak dari target akan disambungkan ke parent.right. Jika target mempunyai anak maka harus dicarikan successor menggunakan method getSuccessor. Pada Method getSuccessor, variabel successor dan succesorParent dibuat. Successor mengambil node anak kanan dari target dan successorParent mengambil noce target. Selama sucessor. left tidak sama dengan null, maka sucessorParent menganbil node dari successor, dan successor mengambil node dari successor.left. Setelah itu melakukan pengecekan Jika, Successor tidak sama dengan anak kanan target maka sucessorParent.left mengambil nilai dari successor.right, dan successor.right mengambil nilai dari anak kanan target. Lalu mengembalikan node successor. Kembali ke Method delete dilakukan pengecekan. Jika target sama dengan root maka, root mengambil node Successor. Setelah itu dilakukan lagi pengecekan jiak status isLeftChild benar maka parent.left mengambil node dari successor, jika salah maka parent.right mengambil node dari successor. Lalu successor.left mengambil nilai dari anak kiri target.

### 2.  Implementasi Binary Tree dengan Array

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 13\src\BinaryTreeMain01.java'
```
Or
```bash
cd '.\Pertemuan 13\src\'
java BinaryTreeMain01.java
```
* Output
``` shell
Inorder Traversal Mahasiswa: 
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
```
* Question
1.  Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?\

Answer: atribut data berguna untuk sebagai tempat untuk menaruh data mahasiswa. idxLast berguna sebagai nomor index akhir untuk data dalam array data mahasiswa.

2. Apakah kegunaan dari method populateData()?\

Answer: PopulateData berguna untuk menambahkan data array ke dalam binary tree.

3. Apakah kegunaan dari method traverseInOrder()?\

Answer: traverseInOrder menampilkan data mahasiswa sesuai dengan urutan.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?\

Answer: posisi right child nya ada pada Index 5 (2 * 2 + 1) dan posisi left child nya pada index 6(2 * 2 + 2).

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

Answer: digunakan agar dapat dimasukan ke dalam method populateData(), sebagau index dari nilai valid paling akhir.

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?

Answer: struktur ini dipakai agar dapat menentukan anak dalam binary tree array tersebut. Dikarenakan bagaimana cara dari struktur data dalam array tersebut dibuat, maka dilakukan pemanggilan rekursif dengan nilai idxStart sebagai nilai constructor yang terus berubah. Hal ini memastikan bahwa semua data bisa dapat ditampilkan.

### 3.  Tugas 01

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 13\src\BinaryTreeMain01.java'
```
Or
```bash
cd '.\Pertemuan 13\src\'
java BinaryTreeMain01.java
```
* Output
``` shell
Daftar Mahasiswa dengan ipk diatas 3.50
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Mahasiswa IPK tertinggi
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21

Mahasiswa IPK terendah
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Menambahkan 1 lagi Mahasiswa
Gagal menambahkan Faza! Indeks 14 di luar kapasitas array.

Pre Order Traversal Mahasiswa
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
```







## Authors
Adrian Alexander Sanda.
