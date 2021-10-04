package Strings;

public class Performance {

    public static void main(String[] args) {

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
        }

        System.out.println();

        // this will memory consuming as string will have new object at every iteration without having ref var.
        String s = "";
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);
            s = s + ch;
        }

        System.out.println(s);

        // String Builder comes here to save this mess. It will allow to mutate the string object.

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb);

    }
}


