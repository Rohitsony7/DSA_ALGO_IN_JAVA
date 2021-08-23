package twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {

    public static void main(String[] args) {

//        int arr[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        int arr[][] = new int[3][3];


        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();

            }
        }


        for (int[] singleArray : arr) {
            System.out.println(Arrays.toString(singleArray));
        }

        System.out.println();


        // rotation of array
        int[][] rotated = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                rotated[row][col] = arr[col][row];

            }
        }

        for (int[] singleArray : rotated) {
            System.out.println(Arrays.toString(singleArray));
        }

    }
}
