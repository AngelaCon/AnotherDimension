import java.io.*;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,8,0};
        int[][] arr2 = {{10,2},{2,2},{8,100}};

        int[][]  A = { {2,2,2},
   {2,2,2},
   {2,2,2} };
        int[] B  = {1,3,5};
        int[][]E = {
{  2,  4, 9 },
{  13, 2, 2 } };
        System.out.println(ArrayOps.sum(arr));
        System.out.println(ArrayOps.largest(arr));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
        System.out.println(ArrayOps.isRowMagic(A));
        System.out.println(ArrayOps.isColMagic(A));
        System.out.println(ArrayOps.isLocationMagic(E, 0, 0));
    }


}
