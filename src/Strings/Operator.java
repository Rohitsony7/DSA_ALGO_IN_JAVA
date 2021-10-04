package Strings;

public class Operator {

    public static void main(String[] args) {
        //will add ascii value of both the char
        System.out.println('a' + 'b');
        // will add 3 in ascii value of a
        System.out.println(('a' + 3));

        //type casting
        System.out.println((char) ('a' + 3));

        // will convert both into string bcs b is string than concatenation
        //7 will be converted into String by its wrapper class : Integer.toString(7)
        System.out.println('a' + "b" + 7);

        //both are string
        System.out.println("a" + "b");
    }
}
