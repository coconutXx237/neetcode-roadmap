package arraysAndHashing;

import java.util.Arrays;

public class TwoSums {

    //tatic int[] nums = {3,4,5,6};
    static int[] nums = {3,2,4};
    //static int target = 7;
    static int target = 6;

    public int[] twoSum(int[] nums, int target) {
        int pointerOne = 0;
        int pointerTwo = nums.length - 1;
        int[] res = new int[2];

        while (pointerOne < pointerTwo) {
            int sum = nums[pointerOne] + nums[pointerTwo];
            if (sum == target ) {
                res[0] = pointerOne;
                res[1] = pointerTwo;
                Arrays.sort(res);
                System.out.println(res[0]);
                System.out.println(res[1]);
                return res;
            } else if (sum < target) {
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new TwoSums().twoSum(nums, target));
    }
}
