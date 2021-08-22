package twoDArray;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("enter start and end point");

        int start= in.nextInt();
        int end = in.nextInt();

        while (!(start >=0 && end < arr.length) || (start > end)){

            System.out.println("Enter value again!");
            start = in.nextInt();
            end= in.nextInt();
        }


        /* two pointer method */
        while (end > start){
            swap(arr[start], arr[end], arr);
            end--;
            start++;

    }
        System.out.println(Arrays.toString(arr));
    }

    // swap, not using third variable
    private static void swap(int i, int i1, @NotNull int arr[]) {
        arr[i1] = arr[i] + arr[i1];
        arr[i] = arr[i1] -arr[i];
        arr[i1] = arr[i1]-arr[i];
    }
}
