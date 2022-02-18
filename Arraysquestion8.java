import java.util.Arrays;

public class Arraysquestion8 {
    //48. Rotate Image --- leetcode
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    } 
    // we wiil rotate the outer rows and columns till i < matrix.length/2 
    public static void rotate(int[][] matrix) {      
        for (int i = 0; i < (matrix.length/2); i++) {     
            int j = i;                       // j will starting from i
            while (j < matrix[0].length -1 -i) {        // till (matrix[0].length -1 -i).  
                int tempx = 0;
                int tempy = 0;
                tempx = matrix[i][j];
                tempy = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = tempx ; 
                tempx = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = tempy;
                tempy = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = tempx;
                matrix[i][j] = tempy;
                
            }
        }
    }
}
