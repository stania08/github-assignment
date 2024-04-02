package basic5;

//R/BCA-22-243

public class fibonacci {

    public static void main(String[] args) {
        // Main method can be left as is for manual testing
    }

    public static int[] generateFibonacciSeries(int n) {
        int[] fibonacciSeries = new int[n];
        if (n >= 1) {
            fibonacciSeries[0] = 0;
        }
        if (n >= 2) {
            fibonacciSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        return fibonacciSeries;
    }
}
