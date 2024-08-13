package arraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    /*
    Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
    */
    static String[] strs = {"act","pots","tops","cat","stop","hat"};
    //static String[] strs = {"x"};
    //static String[] strs = {""};

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }
}
