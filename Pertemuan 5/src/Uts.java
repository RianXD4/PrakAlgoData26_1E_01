public class Uts {
    int nilaitertinggi(int[] arr, int i, int r){
        int tertinggi = 0;
        if (i==r) {
            return arr[i];
        }
        int mid = (i+r)/2;
        int lnil = nilaitertinggi(arr, i, mid);
        int rnil = nilaitertinggi(arr, mid+1, r);
        if (lnil > rnil) {
            tertinggi = lnil;
        } else {
            tertinggi = rnil;
        }
        return tertinggi;
    }

     int nilaiterendah(int[] arr, int i, int r){
        int terendah = 0;
        if (i==r) {
            return arr[i];
        }
        int mid = (i+r)/2;
        int lnil = nilaiterendah(arr, i, mid);
        int rnil = nilaiterendah(arr, mid+1, r);
        if (rnil > lnil) {
            terendah = lnil;
        } else {
            terendah = rnil;
        }
        return terendah;
    }
    double ratanil(int[] arr){
        double ratanil;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        ratanil = total/arr.length;
        return ratanil;
    }
}
