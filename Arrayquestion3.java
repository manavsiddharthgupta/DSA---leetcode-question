import java.util.ArrayList;
import java.util.List;

public class Arrayquestion3 {
    // 1282. Group the People Given the Group Size They Belong To --- leetcode
    public static void main(String[] args) {
        int[] groupsizes = {2,3,3,3,3,3,2,3};
        System.out.println(groupThePeople(groupsizes));
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes){
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (groupSizes[i] == 0) {
                continue;
            } else {
                List<Integer> group = new ArrayList<>();
            int count = groupSizes[i];
            int j = 0;
            while (count > 0) {
                if (groupSizes[i] == groupSizes[j]) {
                    group.add(j);
                    count--;
                }
                j++;
            }
            j = 0;
            while (j < group.size()) {
                groupSizes[group.get(j)] = 0;
                j++;
            }
            answer.add(group);
            }
            
        }

        return answer;
    }
}
