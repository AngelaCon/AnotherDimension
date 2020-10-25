public class Tester {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,8,0};
        int[][] arr2 = {{10,2},{2,2},{8,100}};

        int[][]  A = {{1,0, 12,-1},{7,-2,2,1},{-5,-2,2,-9}};
        int[] B  = {1,3,5};
        System.out.println(ArrayOps.sum(arr));
        System.out.println(ArrayOps.largest(arr));
        System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(A)));
    }


}
