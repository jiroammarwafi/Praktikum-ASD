package minggu5;
public class classFaktorial{
    int faktorialBF(int n) { //  Algoritma Brute Force
        int fakto = 1;
        for (int i=1; i<=n;i++){
            fakto = fakto * i;
        }
        return fakto;
    }
    int faktorialDC(int n) { // Algoritma Divide n Conquer
        if (n==1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}