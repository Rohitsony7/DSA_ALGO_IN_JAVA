package logical_QN;

import java.util.Arrays;

public class VarArg {

    public static void main(String[] args) {

        fun(1,2,3,4,5,6,7);
    }

    static void  fun(int ...v) // variable length argument in java  ...v
    {

        System.out.println(Arrays.toString(v));


    }
}
