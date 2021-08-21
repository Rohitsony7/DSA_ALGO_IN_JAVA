package logical_QN;

import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {


        while (true) {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();


            if (x > Integer.MAX_VALUE && x < Integer.MAX_VALUE) {

                System.out.println(0);
            }
            int a;
            int res = 0;

            while (x != 0) {

                a = x % 10;
                x = x / 10;
                res = res * 10 + a;

            }


            System.out.println(res);


            class Solution {
                public int reverse(int x) {


                    String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
                    try {
                        return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
                    } catch (NumberFormatException e) {
                        return 0;
                    }

                }
            }


        }
    }

}
