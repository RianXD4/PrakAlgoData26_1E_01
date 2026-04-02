public class DataDosen01 {
    Dosen01[] dataDosen = new Dosen01[10];
    int idx;

    void tambah(Dosen01 dsn){
        if (idx<dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen01 dsn : dataDosen) {
            dsn.tampil();
            System.out.println("-------------------------------------");
        }
    }

    void sortingASC(){
        for (int i = 0; i < dataDosen.length; i++) {
            for (int j = 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia<dataDosen[j-1].usia) {
                    Dosen01 tmp = dataDosen[j-1];
                    dataDosen[j-1]=dataDosen[j];
                    dataDosen[j]=tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            int idxMax=i;
            for (int j = i+1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia>dataDosen[idxMax].usia) {
                    idxMax=j;
                }
            }
            Dosen01 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
        Dosen01 temp = dataDosen[i];
        int j=i;
        while (j > 0 && dataDosen[j-1].usia < temp.usia) {
            dataDosen[j] = dataDosen[j-1];
            j--;
        }
        dataDosen[j] = temp;
    }
    }
}
