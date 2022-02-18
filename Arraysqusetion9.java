import java.util.Arrays;

public class Arraysqusetion9 {
    //1685. Sum of Absolute Differences in a Sorted Array---leetcode
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));
    }
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        // create a result array same length as nums
       int[] result = new int[nums.length];
       int totalsum = 0;
       // first we will find the total sum in order to find the right sum.
       for (int i = 0; i < nums.length; i++) {
           totalsum += nums[i];
       }
       int leftsum = 0;
       // as we traverse each index find left sum.
       for (int i = 0; i < result.length; i++) {
           result[i] = (Math.abs((i*nums[i]) - leftsum) + Math.abs((totalsum - leftsum - nums[i]) - ((nums.length - i - 1)*nums[i])));
           leftsum += nums[i];
       }
       return result;
    }
}
