package twoPointers;


public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int pointerA = 0;
        int pointerB = height.length - 1;

        while (pointerA < pointerB) {
            maxArea = Math.max(maxArea, Math.min(height[pointerA], height[pointerB]) * (pointerB - pointerA));
            if (height[pointerA] < height[pointerB]) {
                pointerA++;
            } else {
                pointerB--;
            }
        }
        return maxArea;
    }
    /*public static int maxArea(int[] height) {
        int maxArea = 0;
        int pointerA = 0;
        int pointerB = height.length - 1;

        while (pointerA < pointerB) {
            int currMinHeight = Math.min(height[pointerA], height[pointerB]);
            int currWidth = Math.abs(pointerA - pointerB);
            int currArea = currMinHeight * currWidth;

            if (currArea > maxArea) maxArea = currArea;

            if (height[pointerA] < height[pointerB]) {
                pointerA++;
            } else {
                pointerB--;
            }
        }
        return maxArea;
    }*/

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7}; // 49
        int[] height2 = {1,1}; // 1
        System.out.println(maxArea(height));
        System.out.println(maxArea(height2));
    }
}
