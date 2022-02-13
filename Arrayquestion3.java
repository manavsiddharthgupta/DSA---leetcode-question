import java.util.ArrayList;
import java.util.List;

public class Arrayquestion3 {
    // 1282. Group the People Given the Group Size They Belong To --- leetcode
    public static void main(String[] args) {
        int[] groupsizes = {2,3,3,3,3,3,2,3};
        System.out.println(groupThePeople(groupsizes));
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes){
        List<List<Integer>> answer = new ArrayList<>(); // create list of list for grouping the people 
        for (int i = 0; i < groupSizes.length; i++) {        
            if (groupSizes[i] == 0) {                    // check if people have already grouped. grouped people have value 0.
                continue;
            } else {                                        // else now we will create a list to group people. 
                List<Integer> group = new ArrayList<>();   // create a list for group of same size 
            int count = groupSizes[i];                     // count total number of people can be in list
            int j = 0;                   
            while (count > 0) {                                  // we will traverse until we found total number of people that can be in group of same size.
                if (groupSizes[i] == groupSizes[j]) {      
                    group.add(j);
                    count--;
                }
                j++;
            }
            j = 0;                // now we will make every person value zeo those who have been grouped
            while (j < group.size()) {
                groupSizes[group.get(j)] = 0;
                j++;
            }
            answer.add(group);           // every list(group) should be added in answer list
            }
            
        }

        return answer;
    }
}
