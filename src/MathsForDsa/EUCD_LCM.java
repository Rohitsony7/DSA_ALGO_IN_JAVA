package MathsForDsa;

public class EUCD_LCM {

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println("HCM : "+ gcd(a, b));
        System.out.println("LCM : " + lcm(a, b));
    }

    private static int lcm(int a, int b) {

        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
