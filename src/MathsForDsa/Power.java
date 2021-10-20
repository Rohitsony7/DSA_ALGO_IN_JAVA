package MathsForDsa;

public class Power {

    public static void main(String[] args) {
        int base = 3;
        int pow = 4;
        int ans = 1;

        while (pow > 0) {

            if ((pow & 1) == 1) {
                ans *= base;
            }

            pow >>= 1;

            base = base * base;


        }

        // log(pow)
        System.out.println(ans);

    }
}
