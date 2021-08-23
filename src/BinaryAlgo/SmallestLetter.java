package BinaryAlgo;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {

    public static void main(String[] args) {

        System.out.println(nextGreatestLetter(new char[]{'c', 'd', 'e', 'f', 'j'}, 'a'));
    }


    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]) start = mid + 1;
            if (target < letters[mid]) end = mid - 1;

        }
        return letters[start % letters.length]; // for ceiling value
//        return letters[end]; // for floor value

    }

}
