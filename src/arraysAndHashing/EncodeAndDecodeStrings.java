package arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length()).append("#").append(str);
        }
        return res.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') j++;
            int wordLen = Integer.parseInt(str.substring(i, j));
            i = j + 1 + wordLen;
            res.add(str.substring(j + 1, i));
        }
        return res;
    }

public static void main(String[] args) {
        //List<String> strs = new ArrayList<>(List.of("neet","code","love","you"));
        List<String> strs = new ArrayList<>(List.of("we","say",":","yes","!@#$%^&*()"));
        //List<String> strs = new ArrayList<>(List.of(""));
        //List<String> strs = new ArrayList<>();
        String encStr = EncodeAndDecodeStrings.encode(strs);
        System.out.println("encStr: " + encStr);
        List<String> decStrList = EncodeAndDecodeStrings.decode(encStr);
        System.out.println("decStrList: " + decStrList);
    }
}