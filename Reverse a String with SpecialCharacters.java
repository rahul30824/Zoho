class Main {
    public static String reverseString(String s) {
        // Convert the input string into a character array for easier manipulation
        char[] arr = s.toCharArray();
        
        // Initialize two pointers: one at the beginning (left) and one at the end (right)
        int left = 0, right = arr.length - 1;
        
        // Traverse the array with two pointers until they meet
        while (left < right) {
            // If left character is a special character, move the left pointer to the right
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // If right character is a special character, move the right pointer to the left
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // If both characters are letters, swap them
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                // Move both pointers inward
                left++;
                right--;
            }
        }
        
        // Convert the modified character array back to a string and return it
        return new String(arr);
    }

    public static void main(String[] args) {
        // Test the function with an example string
        String s = "a,b$c";
        System.out.println(reverseString(s));  // Output: "c,b$a"
    }
}
