package Amdocs_Questions;

import java.util.HashSet;
import java.util.List;

public class Word_Break {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");

        System.out.println(wordBreak(s, wordDict));
    }

    static boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }
        
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix) && wordBreak(s.substring(i), wordDict)) {
                return true;
            }
        }
        
        return false;
       

    }

}
