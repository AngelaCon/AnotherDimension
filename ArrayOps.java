public class ArrayOps {
    public static void main(String[] args) {
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static  int largest(int[]arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
     }

     public static int[] sumRows(int[][] matrix) {
         int[] arr = new int[matrix.length];
         for (int i = 0; i < matrix.length; i++){
             arr[i] = sum(matrix[i]);
         }
         return arr;
     }

     public static  int[] largestInRows(int[][] matrix) {
         int[] arr = new int[matrix.length];
         for (int i = 0; i < matrix.length; i++){
             arr[i] = largest(matrix[i]);
         }
         return arr;
     }




     public static String arrToString(int[] arr){
        if (arr.length == 0) return "{}";
        String output = "{";
        for (int i = 0; i < arr.length-1; i++){
          output = output +  arr[i] + ", ";
        }
        output = output + arr[arr.length-1] + "}";
        return output;
}

}
