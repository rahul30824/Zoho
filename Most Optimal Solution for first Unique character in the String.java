class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256]; // Frequency array for ASCII

        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Find index of first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }
}
