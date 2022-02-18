import java.util.Arrays;

public class Arraysquestion4 {
    //1637. Widest Vertical Area Between Two Points Containing No Points ---leetcode
    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int max = maxWidthOfVerticalArea(points);
        System.out.println(max);
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] allwidth = new int[points.length];  // create an array that will contains all width points.
        for (int i = 0; i < points.length; i++) {
            allwidth[i] = points[i][0];
        }
        Arrays.sort(allwidth);   // sort the array anf find max difference between two adjacent index.
        System.out.println(Arrays.toString(allwidth));
        int max = 0;
        for (int i = 1; i < allwidth.length; i++) {
            if (max < allwidth[i] - allwidth[i-1]) {
                max = allwidth[i] - allwidth[i-1];
            }
        }

        return max;   // finally return the max.
    }
}
