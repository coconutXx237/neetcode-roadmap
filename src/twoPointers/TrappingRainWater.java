package twoPointers;

public class TrappingRainWater {

    public static int trapOptimized(int[] height) {
        int res = 0;

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int leftMax = height[leftPointer];
        int rightMax = height[rightPointer];

        while (leftPointer < rightPointer) { // {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
            if (leftMax > rightMax){
                rightPointer--;
                rightMax = Math.max(rightMax, height[rightPointer]);
                int trappedWater = rightMax - height[rightPointer];
                if (trappedWater > 0) res += trappedWater;
            } else {
                leftPointer++;
                leftMax = Math.max(leftMax, height[leftPointer]);
                int trappedWater = leftMax - height[leftPointer];
                if (trappedWater > 0) res += trappedWater;
            }
        }
        return res;
    }
    public static int trap(int[] height) {
        int res = 0;
        int[] maxLeftArr = new int[height.length];
        int[] maxRightArr = new int[height.length];

        int maxLeft = height[0];
        for (int i = 0; i < height.length; i++) {
            if (i != 0 && height[i - 1] > height[i] && height[i - 1] > maxLeft) {
                maxLeft = height[i - 1];
            }
            maxLeftArr[i] = maxLeft;
        }

        int maxRight = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            if (i != height.length - 1 && height[i + 1] > height[i] && height[i + 1] > maxRight){
                maxRight = height[i + 1];
            }
            maxRightArr[i] = maxRight;
        }

        int[] minArr = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            minArr[i] = Math.min(maxLeftArr[i], maxRightArr[i]);
        }
        for (int i = 0; i < height.length; i++){
            int trapped = minArr[i] - height[i];
            if (trapped > 0) res += trapped;
        }
            return res;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; // 6
        int[] height2 = {4,2,0,3,2,5};            // 9

        System.out.println(trapOptimized(height));
        System.out.println(trapOptimized(height2));
    }


}
