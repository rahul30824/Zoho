import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert to lowercase and replace non-alphabetic characters with spaces
        String normalized = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        
        // Split into words
        String[] words = normalized.split("\\s+");
        
        // Store banned words in a HashSet
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Count word frequencies
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        // Find the most common word
        String mostCommon = "";
        int maxFreq = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
        
        return mostCommon;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(sol.mostCommonWord(paragraph, banned)); // Output: "ball"
    }
}
