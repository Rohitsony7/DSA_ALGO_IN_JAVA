package MathsForDsa;

import java.util.ArrayList;

public class FactorsMethod {

    public static void main(String[] args) {
        int n = 25;
//        factor1(n);
//        System.out.println();
        factor2(n);
    }


    private static void factor1(int n) {
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

    //O(sqrt(n))
    private static void factor2(int n) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                System.out.print(i + " ");

                if (n / i != i) {
                    al.add(n / i);
                }
            }

        }

        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.print(al.get(i) + " ");
        }

    }
}
