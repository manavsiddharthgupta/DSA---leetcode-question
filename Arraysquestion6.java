import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraysquestion6 {
    //1329. Sort the Matrix Diagonally ----leetcode
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        System.out.println(Arrays.deepToString(diagonalSort(mat)));
    }
    public static int[][] diagonalSort(int[][] mat) {
        // we have to iterate all row[0] of mat
        for (int i = mat[0].length-1; i >= 0; i--) {
            int j = 0;             // here j is the row starting from 0 till mat.length in each loop
            int k = i;             // k is col starting as i in each loop
            ArrayList<Integer> list = new ArrayList<>(); // create an array list for taking the diagonal value in list. 
            while (j < mat.length && k < mat[0].length) {  // condition must applied  for j and k
                list.add(mat[j][k]);
                k++;
                j++;
            }
            Collections.sort(list);              // sort the list and return the sorted value
            j = 0;                     
            k = i;              
            while (j < list.size()) {       // here j is starting from 0 to list.size()-1
                mat[j][k] = list.get(j);
                k++;
                j++;
            }
        }
        // now all the row[0] value have been iterated but we have to iterate the col[0] except row[0] so start from 1
        for (int i = 1; i < mat.length; i++) {
            int j = i;       // here j is row which will start as i
            int k = 0;       // here k is col which will start from 0.
            ArrayList<Integer> list = new ArrayList<>();  // create an array list for taking the diagonal  
            while (j < mat.length && k < mat[0].length) {    // condition must applied  for j and k
                list.add(mat[j][k]);
                k++;
                j++;
            }
            Collections.sort(list);           // sort the list and return the sorted value
            j = i;
            k = 0;
            while (k < list.size()) {    // here k is starting from 0 to list.size()-1
                mat[j][k] = list.get(k);
                k++;
                j++;
            }
        }
        return mat;
    }
    
}
