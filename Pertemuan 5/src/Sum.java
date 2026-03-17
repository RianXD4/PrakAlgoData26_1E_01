public class Sum {
    double[] keuntungan;

    Sum(int e){
        keuntungan = new double[e];
    }
    double totalBF(){
        double total=0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int i,int r){
        if (i==r) {
            return arr[i];
        }
        int mid = (i+r)/2;
        double lsum=totalDC(arr, i, mid);
        double rsum=totalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}
