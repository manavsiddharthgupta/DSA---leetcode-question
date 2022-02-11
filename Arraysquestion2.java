import java.util.Arrays;

public class Arraysquestion2 {
   // 1769. Minimum Number of Operations to Move All Balls to Each Box -- Leetcode
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("11011")));
    }
    public static int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()]; // answer array
        char[] arrbox = new char[boxes.length()];        // converting string into char array
        for (int i = 0; i < arrbox.length; i++) {
            arrbox[i] = boxes.charAt(i);
        }
        for (int i = 0; i < ans.length; i++) {   // calling function for each index to find minimum operaton
            ans[i] = minimumoperation(arrbox,i);
        }
        return ans;
    }
    public static int minimumoperation(char[] arrbox, int i){
        int count = 0;
        for (int j = 0; j < arrbox.length; j++) {
            if (arrbox[j] == '1') {
                count = count + Math.abs(i - j);     // condition given in question
            }
        }
        return count;
    }
}
