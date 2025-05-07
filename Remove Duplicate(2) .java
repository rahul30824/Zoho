class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If length is <= 2, no change is needed.

        int i = 2; // Start from the third element (index 2).
        
        for (int j = 2; j < nums.length; j++) {
            // Compare current element (nums[j]) with the element two places before (nums[i - 2]).
            if (nums[j] != nums[i - 2]) {
                // If it's different, place it at the next available position i.
                nums[i] = nums[j];
                i++; // Increment i to point to the next valid position.
            }
        }

        // i now represents the length of the modified array with at most two occurrences.
        return i;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        
        int length = sol.removeDuplicates(nums);
        
        // Print the modified array up to the valid length
        System.out.println("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        // Print the length of the modified array
        System.out.println("Length of modified array: " + length);
    }
}
