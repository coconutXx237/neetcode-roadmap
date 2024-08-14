package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //public static int[] nums = {1, 2, 3, 3};
    //public static int[] nums = {1, 2, 3, 4};
    public static int[] nums = {2,2,1,1,3,1,2,3,1,4};

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean isDuplicated = false;
        for (int num : nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return isDuplicated;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().hasDuplicate(nums));
        System.out.println();
    }
}
