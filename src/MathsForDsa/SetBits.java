package MathsForDsa;

public class SetBits {
    public static void main(String[] args) {

        int n = 30;

        // to convert decimal to binary
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));

    }

    private static int setBits(int n) {

        return Integer.bitCount(n);


    }
}
