public class PalindromeWordCounter {
    // Function to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to count palindrome words in a sentence
    public static int countPalindromeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return 0;

        // Split sentence into words using whitespace
        String[] words = sentence.split("\\s+");
        int count = 0;

        // Check each word for palindrome
        for (String word : words) {
            // Convert to lowercase for case insensitivity
            if (isPalindrome(word.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = "Madam Arora teaches malayalam";
        String input2 = "Nitin speaks malayalam";

        System.out.println(countPalindromeWords(input1)); // Output: 3
        System.out.println(countPalindromeWords(input2)); // Output: 2
    }
}
