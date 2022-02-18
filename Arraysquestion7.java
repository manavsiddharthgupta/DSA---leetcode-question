public class Arraysquestion7 {
    //2023. Number of Pairs of Strings With Concatenation Equal to Target----leetcode
    public static void main(String[] args) {
        String[] nums = {"1","1","1"};
        String target = "11";
        int ans = numOfPairs(nums, target);
        System.out.println(ans);
    }
    public static int numOfPairs(String[] nums, String target) {
        int count = 0 ;           // variable that contains answer
        for (int i = 0; i < nums.length; i++) {
            int j = 0 ;          // second loop to concatenate
            while (j < nums.length) {
                if (i != j) {                        // condition given in the question
                    String concatenated = nums[i] + nums[j];     // making new String that should be equal to target you dont have to craete new String ...
                    if (concatenated.equals(target)) {
                        count++;                       // if equals then count ++
                    }
                }
                j++;
            }
        }
        return count;              // return the count
    }
}
