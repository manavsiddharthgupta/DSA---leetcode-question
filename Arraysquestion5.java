import java.util.Arrays;

public class Arraysquestion5 {
    //2149. Rearrange Array Elements by Sign ---leetcode
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];          // create an array
        int j = 0;
        for (int i = 0; i < nums.length; i++) {     // take all positive nums[i] and place in ans[alleven]
            if (nums[i] > 0) {
                ans[j] = nums[i];
                j = j + 2;
            }
        }
        j = 1;
        for (int i = 0; i < nums.length; i++) {   // take all positive nums[i] and place in ans[allodd]
            if (nums[i] < 0) {
                ans[j] = nums[i];
                j = j + 2;
            }
        }
        return ans;            // return the ans
    }
}
