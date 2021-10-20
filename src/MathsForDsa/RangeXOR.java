package MathsForDsa;

public class RangeXOR {

    public static void main(String[] args) {

        int a = 3;
        int b = 9;

        int res = xor(b) ^ xor(a - 1);
        System.out.println(res);

    }

    private static int xor(int n) {

        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }

        return 0;


    }
}
