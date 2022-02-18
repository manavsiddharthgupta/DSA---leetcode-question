public class Arraysquestion11 {
    //1558. Minimum Numbers of Function Calls to Make Target Array
    public static void main(String[] args) {
        int[] nums = {7,4,3,2,0,2};
        System.out.println(minOperationsopt(nums));
    }
    public static int minOperations(int[] nums) {
        int count = 0;   // counting variable will count the minoperation.
        // we will go as opposite oif modify func in order to make nums as arr were, each element in idex arr is 0. 
        while (true) {   // while this true
            for (int i = 0; i < nums.length; i++) {   // check if there is odd num[index] or not,if it is odd make it even by substractin by 1
                if (nums[i]%2 != 0) {
                    nums[i] = nums[i] - 1;
                    count++;   // add 1 to count in each operation as given in modify func.
                }
            }
            // check if all element is same as element of arr which arr[everyindex] = 0.
            boolean check = true;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    check = false;
                    break;
                }
            }
            if (check) {      // we dont want to add 1 in count as we have to find min operation so break if copndition is true.
                break;
            }
            // divide every element by 2 to make nums as arr.
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]/2;
            }
            count++;
            // again check if all element is same as element of arr which arr[everyindex] = 0.
            check = true;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                break; // break if all element of nums is as arr.
            }
            
        }
        return count;  // and return it.
    }

    // this is more optimized.
    public static int minOperationsopt(int[] nums) {
        int count = 0;   
        
        int maxindexofnums = maxofnums(nums);
        while (nums[maxindexofnums] != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]%2 != 0) {
                    nums[i] = nums[i] - 1;
                    count++;
                }
            }
            if (nums[maxindexofnums] == 0) {
                break;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]/2;
            }
            count++;
        }
        return count;
    }
    public static int maxofnums(int[] nums){
        int max = 0;
        int maxindex = 0;
        for (int index = 0; index < nums.length; index++) {
            if (max < nums[index]) {
                maxindex = index;
                max = nums[index];
            }
        }
        return maxindex;
    }
}
