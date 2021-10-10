package arraysAndStrings;

public class Question1point8 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3} ,{4,5,6} ,{7,8,9}};
        System.out.println(" converted matrix :" + zeroMatrix(matrix));
    }

    private static int[][] zeroMatrix(int[][] matrix) {
      return new int[matrix.length][matrix.length];
    }
}
