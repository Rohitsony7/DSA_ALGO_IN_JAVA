package MathsForDsa;


//A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.
// First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), …. Write a function to find the nth Magic number.
public class MagicNumber {

    public static void main(String[] args) {

        int num = 10;
        int ans = 0;
        int base = 5;

        while (num > 0) {

            int lastBit = num & 1;
            num >>= 1;
            ans += lastBit * base;
            base = base * 5;

        }

        System.out.println(ans);

        //complexity will be log(num)


    }


}
