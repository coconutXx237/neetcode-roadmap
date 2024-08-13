package arraysAndHashing;

public class ValidAnagram {

    static String s = "anagram";
    static String t = "nagaram";

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int count : store) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
