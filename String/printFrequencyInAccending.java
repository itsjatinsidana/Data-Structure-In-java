package String;
import java.util.*;

public class printFrequencyInAccending {
  public static void main(String[] args) {
      String s = "tree";
        String sortedString = FrequencySort(s);
        System.out.println(sortedString);
  }

  static String FrequencySort(String s) {

        // Step 1: Create a character frequency map
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        // Step 2: Count character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        // Step 3: Create a list of characters and sort by frequency
        List<Character> sortedChars = new ArrayList<>(charFrequency.keySet());
        sortedChars.sort(new Comparator<Character>() {
            public int compare(Character a, Character b) {
                return charFrequency.get(b) - charFrequency.get(a);
            }
        });
        
        // Step 4: Build the sorted string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortedChars.size(); i++) {
            char c = sortedChars.get(i);
            int frequency = charFrequency.get(c);
            for (int j = 0; j < frequency; j++) {
                result.append(c);
            }
        }
        
        // Step 5: Return the sorted string
        return result.toString();
    }
}
   
      
    



