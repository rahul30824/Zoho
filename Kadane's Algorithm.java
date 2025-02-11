class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = nums[0]; // Start the current sum with the first element

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to include the current number in the existing subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if the currentSum is larger
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Return the largest sum found
    }
}
