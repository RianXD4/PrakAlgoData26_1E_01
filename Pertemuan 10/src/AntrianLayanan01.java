public class AntrianLayanan01 {
Mahasiswa01[] data;
int front;
int rear;
int size;
int max;

public AntrianLayanan01(int n){
    max = n;
    data = new Mahasiswa01[max];
    size = 0;
    front = rear = -1;
}
public boolean isEmpty(){
    return size == 0;
}

public boolean isFull(){
    return size == max;
}

public void peek(){
    if (!isEmpty()) {
        System.out.println("Nama Mahasiswa terdepan: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[front].tampilkanData();
    } else {
        System.out.println("Queue masih kosong");
    }
}
public void print(){
    if (isEmpty()) {
        System.out.println("Queue masih kosong");
    } else {
        int i = front;
        int cont = 1;
        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        while (i != rear) {
            System.out.print((cont)+". ");
            cont++;
            data[i].tampilkanData();
            i = (i+1) % max;
        }
        data[i].tampilkanData();
        System.out.println("Jumlah elemen = "+size);
    }
}

public void clear(){
    if (!isEmpty()) {
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    } else {
        System.out.println("Queue masih kosong");
    }
}

public void Enqueue(Mahasiswa01 dt){
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
        System.out.println(dt.nama+" Berhasil masuk ke antrian.");
    }
}

public Mahasiswa01 Dequeue(){
    Mahasiswa01 dt;
    if (isEmpty()) {
        System.out.println("Queue masih kosong");
        return null;
    } else {
        dt = data[front];
        size--;
        if (isEmpty()) {
            front = rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }
    return dt;
}

public int getJumlahAntrian(){
    return size;
}


}
