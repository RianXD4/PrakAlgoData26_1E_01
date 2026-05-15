# REPORT

Answer on jobsheet 12.

## Description

My answer on jobsheet 12.

## Dependencies

* JDK version 8 minimum (Mine JDK 24.0.2),
* Operating System (Mine Windows),
* Text editor e.g. VSCode (Mine VSCode).

## Executing program

### 1.  Operasi Penambahan pada Double Linked List

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 12\src\DoubleLinkedListMain.java'
```
Or
```bash
cd '.\Pertemuan 12\src\'
java DoubleLinkedListMain.java
```
* Output
``` shell
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 2
Masukkan NIM    : 123
Masukkan Nama   : Harry
Masukkan Kelas  : 1A
Masukkan IPK    : 3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123
Masukkan data baru: 
Masukkan NIM    : 321   
Masukkan Nama   : Potter
Masukkan Kelas  : 1B
Masukkan IPK    : 3.55

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
NIM     :123
Nama    :Harry
Kelas   :1A
IPK     :3.76
NIM     :321
Nama    :Potter
Kelas   :1B
IPK     :3.55
```
* Question
1.  Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!\
Answer: Single linked list hanya dapat melakukan traversal satu arah, sedangkan Double linked list dapat melakukan traversal dua arah(Next dan Prev).
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!\
Answer: Next untuk menghubungkan node sekarang dengan node selanjutnya, dan Prev berguna untuku menghubungkan node sekarang dengan node sebelumnya.
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!\
Answer: Konstruktor double linked list berguna untuk mengatur nilai head dan tail menjadi null.
4. Perhatikan potongan kode berikut:
```java
if (isEmpty()) {
    head = tail = newNode;
}
```
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?\
Answer: Karena DLL baru diisi dengan satu node maka node tersebut menjadi head dan tail.
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!\
Answer: Modifikasi kode.
```java
if (isEmpty()) {
    System.out.println("Linked list masih kosong: ");
    return;   
}
```
6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!\
Answer: Modifikasi kode
```java
public void printReverse(){
    if (isEmpty()) {
        System.out.println("Linked list masih kosong");
        return;
    }

    Node01 current = tail;
    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
```

### 2.  Operasi Penghapusan pada Double Linked List

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 12\src\DoubleLinkedListMain.java'
```
Or
```bash
cd '.\Pertemuan 12\src\'
java DoubleLinkedListMain.java
```
* Output
``` shell
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 5

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
NIM     :123
Nama    :Harry
Kelas   :1A
IPK     :3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 0
Program selesai.
```
* Question
1. Perhatikan potongan kode berikut pada method removeFirst():
```java
head = head.next;
head.prev = null;
```
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
Answer: Pointer Head dipindahkan ke depan Head.next lalu, koneksi head.prev diganti menjadi null.
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!\
Answer: modifikasi kode. 
```java
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 remove = head;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 remove = tail;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
```

### 3.  Tugas Praktikum

* How to run the program.
Enter this in the terminal.
```bash
java '.\Pertemuan 12\src\DoubleLinkedListMain.java'
```
Or
```bash
cd '.\Pertemuan 12\src\'
java DoubleLinkedListMain.java
```
* Question
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!\
Answer: 
```java
    public void addAt(int idx, Mahasiswa01 dt){
        Node01 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
            if (current == null){
                System.out.println("Data dengan index "+idx+" diluar besar DLL");
                return;
            }
        }

        Node01 newNode = new Node01(dt);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current.prev;
            current.prev = newNode;
            newNode.next = current;
        }
    }
```
2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!\
Answer: 
```java
    public void removeAfter(String keyNIM){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM "+keyNIM+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
        
    }
```
3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!\
Answer:
```java
    public void removeAt(int idx){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (idx == 0) {
            removeFirst();
            return;
        }
        Node01 current = head;
        for (int i = 0; i < idx-1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data pada index  "+idx+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
    }
```
4. Tambahkan method:\
a. getFirst()\
b. getLast()\
c. getIndex()\
untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu\
Answer: 
```java
    public void getFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        head.data.tampil();
    }
    
    public void getLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        tail.data.tampil();
    }

    public void getIndex(int idx){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
         if (current == null) {
            System.out.println("data pada index  "+idx+" tidak ditemukan.");
            return;
        }
        current.data.tampil();
    }
```
5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.\
Answer: 
```java
//pada class DLL ditambahkan atribut
int size;

 public DoubleLinkedList01(){
        head = null;
        tail = null;
        size = 0;
    }

public void total(){
        System.out.println("size dari DLL adalah "+size);
    }

// dilakukan modifikasi pada setiap method yang menambahkan node akan ditambahkan size++
// sedangkan yang menghapus node akan ditambahkan size--
    public void addLast(Mahasiswa01 dt){
        Node01 newNode = new Node01(dt);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAt(int idx, Mahasiswa01 dt){
        Node01 current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
            if (current == null){
                System.out.println("Data dengan index "+idx+" diluar besar DLL");
                return;
            }
        }

        Node01 newNode = new Node01(dt);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current.prev;
            current.prev = newNode;
            newNode.next = current;
        }
        size++;
    }

    public void insertAfter(String keyNIM, Mahasiswa01 dt){
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM "+keyNIM+" tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(dt);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }
    
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 remove = head;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 remove = tail;
        System.out.println("Data yang dihapus");
        remove.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void removeAfter(String keyNIM){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data dengan NIM "+keyNIM+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
        size--;
        
    }

    public void removeAt(int idx){
         if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (idx == 0) {
            removeFirst();
            return;
        }
        Node01 current = head;
        for (int i = 0; i < idx-1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data pada index  "+idx+" tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        current.next.prev = current;
        size--;
    }

```




## Authors
Adrian Alexander Sanda.
