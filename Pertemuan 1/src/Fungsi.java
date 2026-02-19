public class Fungsi {
    static int bunga[][]= {{10,5,15,7},
                        {6,11,9,12},
                        {2,10,10,5},
                        {5,7,12,9} };
    static int harga [] = {75000,50000,60000,10000};
  
    public static void main(String[] args) {
        hitungttl();
    }

    public static long[] hitungttl(){
           
        long ttl[] = new long[bunga.length];
        for (int i = 0; i < bunga.length; i++) {
            String stts;
            for (int j = 0; j < bunga[i].length; j++) {
                ttl[i]+=bunga[i][j]*harga[j];
            }
            if (ttl[i]>1500000) {
                stts = "Sangat Baik";
            } else {
                stts = "Perlu Evaluasi";
            }
            System.out.println("Pendapatan ROYALGARDEN "+(i+1)+" Sebesar RP"+ttl[i]+" Status: "+stts);
        }

        return ttl;
    } 
}
