package Amdocs_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> anagramGroups = groupAnagrams(strs);

        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> anagramGroups = new HashMap<>();
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String sortedString = new String(a);
            if (!anagramGroups.containsKey(sortedString)) {
                anagramGroups.put(sortedString, new ArrayList<>());
            }
            anagramGroups.get(sortedString).add(str);
        }

        return new ArrayList<>(anagramGroups.values());

    }

}

