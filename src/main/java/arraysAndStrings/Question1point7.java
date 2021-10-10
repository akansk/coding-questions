package arraysAndStrings;

import java.util.Arrays;

public class Question1point7 {
    public static void main(String[] args) {
        int[][] matrix = {{ 1 , 2 ,3} ,{4 , 5, 6}, { 7 , 8 , 9}};

        System.out.println((Arrays.deepToString(rotateMatrix(matrix))));
    }

    private static int [][] rotateMatrix(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix.length];
        int k = matrix.length -1;
        for(int i = 0  ; i < matrix.length ; i++ ){
            for( int j=0 ; j < matrix.length ; j++) {
                mat[j][k] = matrix[i][j];
            }
            k--;
        }
        return mat;
    }


}
