package BinaryAlgo.twoDBianrySearch;

import java.util.Arrays;

public class TwoDBinarySearchRowSorted {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(Arrays.toString(search(arr, 17)));

    }

    // do search in provided row between cStart and cEnd/
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {

                return new int[]{row, mid};

            } else if (matrix[row][mid] < target) {

                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }

        return new int[]{-1, -1};

    }


    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // if matrix is empty trow error


        if (rows == 1) {

            return binarySearch(matrix, 0, 0, cols - 1, target);

        }

        //run the loop till two rows are remaining

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) { // this will  ensure that there will be two rows at the end

            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) return new int[]{mid, cMid};
            else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows

        //1. will check if the middle cols contains the target

        if (matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        if (matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        //if found not, We will check in all two rows left and right

        if (target <= matrix[rStart][cMid - 1]) return binarySearch(matrix, rStart, 0, cMid - 1, target);


        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {

            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (target <= matrix[rStart + 1][cMid - 1]) return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);

        else {

            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}
