package Recursion;

public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    private static int fibo(int n) {
        // base condition
        if (n < 3) return n;

        return fibo(n - 1) + fibo(n - 2);
    }

}
