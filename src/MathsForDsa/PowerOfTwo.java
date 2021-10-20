package MathsForDsa;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find if is it power of two.\n");
        int n = sc.nextInt();
        if (n == 0) System.out.println(false);
        else {
            boolean res = (n & (n - 1)) == 0;
            System.out.println(res);
        }


    }
}
