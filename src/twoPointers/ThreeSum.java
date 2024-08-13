package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        int j_left = 1;
        while (i < j_left) {
            j_left = i + 1;
            int k_right = nums.length - 1;
            while (j_left < k_right){
                int sum = nums[i] + nums[j_left] + nums[k_right];
                if (sum > 0) {
                    k_right--;
                } else if (sum < 0) {
                    j_left++;
                } else if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j_left], nums[k_right]));
                    break;
                }
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        //int[] arr = new int[]{0,1,1};
        //int[] arr = new int[]{0,0,0};
        System.out.println(threeSum(arr).size());
        for (List<Integer> list: threeSum(arr)) {
            System.out.println();
            for (int el: list) {
                System.out.println(el);
            }
        }
    }
}
