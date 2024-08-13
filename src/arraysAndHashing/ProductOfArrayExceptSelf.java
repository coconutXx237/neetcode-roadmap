package arraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6}; // [48, 24, 12, 8]
        int[] res_arr = productExceptSelf(nums);
        StringBuilder s = new StringBuilder();
        for (int i: res_arr) {
            s.append(i).append(" ");
        }
        System.out.println(s); // [48, 24, 12, 8]
    }
}
