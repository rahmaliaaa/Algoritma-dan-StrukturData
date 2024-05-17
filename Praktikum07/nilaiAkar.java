package Praktikum07;

public class nilaiAkar {
    // Brute Force
    public static int bruteForce(int n) {
        if (n <= 1) return n;
        
        int sqrt = 1;
        while (sqrt * sqrt <= n) {
            sqrt++;
        }
        return sqrt - 1;
    }
    // Divide Conquer
    public static int divideConquert(int n) {
        return squareRootUtil(n, 0, n);
    }
    private static int squareRootUtil(int n, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            int sqr = mid * mid;
            if (sqr == n) return mid;
            if (sqr < n) return squareRootUtil(n, mid + 1, end);
            return squareRootUtil(n, start, mid - 1);
        }
        return end;
    }
    public static void main(String[] args) {
        int number = 25;
        // Menggunakan Brute Force
        int sqrtBruteForce = bruteForce(number);
        System.out.println("Akar dari " + number + " (Brute Force) adalah " + sqrtBruteForce);
        // Menggunakan Divide Conquer
        int sqrtDivideConquer = divideConquert(number);
        System.out.println("Akar dari " + number + " (Divide Conquer) adalah " + sqrtDivideConquer);
    }
}
