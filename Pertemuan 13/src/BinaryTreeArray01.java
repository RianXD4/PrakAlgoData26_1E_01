public class BinaryTreeArray01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray01() {
        this.dataMahasiswa = new Mahasiswa01[10];
    }

    void populateData(Mahasiswa01 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa01 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        int idx = 0;
        while (idx < dataMahasiswa.length) {
            if (data.ipk < dataMahasiswa[idx].ipk) {
                int leftIdx = 2 * idx + 1;
                if (leftIdx >= dataMahasiswa.length) {
                    System.out.println("Gagal menambahkan " + data.nama + "! Indeks " + leftIdx + " di luar kapasitas array.");
                    break;
                }
                if (dataMahasiswa[leftIdx] == null) {
                    dataMahasiswa[leftIdx] = data;
                    if (leftIdx > idxLast) {
                        idxLast = leftIdx;
                    }
                    break;
                }
                idx = leftIdx;
            } else {
                int rightIdx = 2 * idx + 2;
                if (rightIdx >= dataMahasiswa.length) {
                    System.out.println("Gagal menambahkan " + data.nama + "! Indeks " + rightIdx + " di luar kapasitas array.");
                    break;
                }
                if (dataMahasiswa[rightIdx] == null) {
                    dataMahasiswa[rightIdx] = data;
                    if (rightIdx > idxLast) {
                        idxLast = rightIdx;
                    }
                    break;
                }
                idx = rightIdx;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
