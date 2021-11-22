package MathsForDsa;

public class isOdd {

    public static void main(String[] args) {

        int n = 11;
        System.out.println(isOddOrEven(n));
    }

    private static boolean isOddOrEven(int n) {

        return (n & 1) == 1;
    }
}
