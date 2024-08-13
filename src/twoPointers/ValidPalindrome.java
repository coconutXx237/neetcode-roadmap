package twoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        s  = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] sArr = s.toCharArray();
        int counterLeftToRight = 0;
        int counterRightToLeft = sArr.length - 1;
        while (counterLeftToRight < counterRightToLeft) {
            if (sArr[counterLeftToRight] == sArr[counterRightToLeft]) {
                counterLeftToRight++;
                counterRightToLeft--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("tab a cat"));
        System.out.println(isPalindrome(" "));
    }
}
