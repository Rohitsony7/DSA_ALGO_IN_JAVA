package MathsForDsa;

public class Sieve {

    public static void main(String[] args) {

        getPrimeRange(40);


    }

    public static void getPrimeRange(int n) {

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {

            if (!isPrime[i]) {

                for (int j = i * 2; j <= n; j += i) {

                    isPrime[j] = true;

                }
            }
        }
        for (int i = 2; i <= n; i++) {

            isPrime[i] = !isPrime[i];
            if (isPrime[i]) {
                System.out.print(i + "   ");
            }


        }


    }
}
