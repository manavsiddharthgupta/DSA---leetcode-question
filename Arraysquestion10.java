import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraysquestion10 {
    //1630. Arithmetic Subarrays ---- leetcode
    public static void main(String[] args) {
        int[] nums = { 4, 6, 5, 9, 3, 7 };
        int[] l = { 0, 0, 2 };
        int[] r = { 2, 3, 5 };
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        boolean[] answer = new boolean[l.length];       // create an boolean array to store your answer
        for (int i = 0; i < l.length; i++) {
            answer[i] = true;                        // initialize ith index as true.
            int[] temp = new int[(r[i] - l[i]) + 1];     // store every subset from l[i] to r[i].
            int k = 0;                              
            for (int j = l[i]; j <= r[i]; j++) {
                temp[k] = nums[j];
                k++;
            }
            Arrays.sort(temp);                // rearrange them for checking
            int check = temp[1] - temp[0];             // check if the arithmetic seq is true or false
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] != check) {
                    answer[i] = false;         
                    break;
                }
            }
        }
        // we have to return in list so update your answer in boolean list. you dont have create boolean array first you can create list at first.
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            ans.add(answer[i]);
        }
        return ans;
    }
}
