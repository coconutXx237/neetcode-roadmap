package twoPointers;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int pointerA = 0;
        int pointerB = numbers.length - 1;

        while (numbers[pointerA] <= numbers[pointerB]) { // {2,7,11,15} t 9 // [2,3,4] t 6 //
            int sum = numbers[pointerA] + numbers[pointerB];
            if (sum > target) {
                pointerB--;
            } else if (sum < target) {
                pointerA++;
            } else if (sum == target) {
                return new int[]{pointerA + 1, pointerB + 1};
            }
        }
        return new int[]{pointerA + 1, pointerB + 1};
    }

    public static void main(String[] args) {
        int[] input = {5,25,75};
        int target = 100;
        //int[] input = {2,7,11,15};
        //int target = 9;
        //int[] input = {2,3,4};
        //int target = 6;
        //int[] input = {-1,0};
       // int target = -1;


        int[] res = twoSum(input, target);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
