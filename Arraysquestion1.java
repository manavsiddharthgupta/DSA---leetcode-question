public class Arraysquestion1 {

    //807. Max Increase to Keep City Skyline       -- Leetcode
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } };
        int ans = maxIncreaseKeepingSkyline(grid);
        System.out.println(ans);
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;
        // create an array that contains max of eachrows of grid
        int[] maxrow = new int[grid.length];
        // create an array that contains max of eachcols of grid
        int[] maxcol = new int[grid[0].length];

        maxrow = findmax(maxrow, grid, true);
        maxcol = findmax(maxcol, grid, false);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int set = Math.min(maxrow[row], maxcol[col]);     // condition according to question
                while (grid[row][col] < set) {     // value of each index must be set - 1 because we are - 
                    grid[row][col]++;                                      // using while in here.
                    count++;
                }
                set = 0;
            }
        }
        return count;
    }

    // fuction to find the max of each rows and col of grid;
    public static int[] findmax(int[] maxarr, int[][] grid, boolean check) {
        for (int row = 0; row < grid.length; row++) {
            int max = 0;
            for (int col = 0; col < grid[0].length; col++) {
                if (check) {                   // check if we finding the max in each rows or column
                    if (max < grid[row][col]) {    
                        max = grid[row][col];
                    }
                } else {
                    if (max < grid[col][row]) {
                        max = grid[col][row];
                    }
                }
            }
            maxarr[row] = max;   // max of ith which is defined as row in here for rows or columns array 
            max = 0;
        }
        return maxarr;
    }
}


