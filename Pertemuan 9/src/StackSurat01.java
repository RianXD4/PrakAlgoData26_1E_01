public class StackSurat01 {
    Surat01[] stack;
    int size;
    int top;
    
    public StackSurat01(int sz){
        size = sz;
        stack = new Surat01[size];
        top = -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Surat01 srt){
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan surat");
        }
    }

    public Surat01 pop(){
        if (!isEmpty()) {
            Surat01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! tidak ada surat");
            return null;
        }
    }

    public Surat01 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].idSurat+"\t"+stack[i].namaMahasiswa+"\t"+stack[i].kelas+"\t"+stack[i].jenisIzin+"\t"+stack[i].durasi);
        }
        System.out.println("");
    }

    public Surat01 cariSurat(String nama){
        int idx = -1;
        for (int i = 0; i <= top; i++) {
            if (nama.equalsIgnoreCase(stack[i].namaMahasiswa)) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("Nama Mahasiswa tidak ditemukan");
            return null;
        } else {
            return stack[idx];
        }
    }
}

