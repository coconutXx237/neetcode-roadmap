package arraysAndHashing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int maxSeqLen = 0;
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int i = 0; i < nums.length; i++) { /* 100,4,200,1,3,2 */
            int current_number = nums[i];
            int curSeqLen = 1;

            if (!numsSet.contains(current_number - 1)) {
                while (numsSet.contains(current_number + 1)) {
                    current_number += 1;
                    curSeqLen += 1;
                }
            }
            maxSeqLen = Math.max(maxSeqLen, curSeqLen);
        }

        return maxSeqLen;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        //System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
