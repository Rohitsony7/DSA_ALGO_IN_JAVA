package logical_QN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter any three digit number:");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.println(a > b ? (Math.max(a, c)) : (Math.max(b, c)));


    }
}