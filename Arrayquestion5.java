import java.util.ArrayList;

public class Arrayquestion5 {
    public static void main(String[] args) {
        String[] bank = {"011101","100110","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        ArrayList<Integer> device = new ArrayList<>();
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            int j = 0;
            while (j < bank[i].length()) {
                if (bank[i].charAt(j) != '0') {
                    count++;
                }
                j++;
            }
            j = 0;
            if (count != 0) {
                device.add(count);
            }
            count = 0;
        }
        int ans = 0;
        for (int i = 0; i < device.size()-1; i++) {                    // [3,2,1]
             ans = ans + (device.get(i) * device.get(i+1));
        }
        return ans;
    }

}
