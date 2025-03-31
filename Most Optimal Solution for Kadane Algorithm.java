class Main {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];  // Add current element to sum
            maxSum = Math.max(maxSum, currentSum);  // Update maxSum

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, -100, 6, 7, 109, -100, 1098, 2};
        System.out.println(maxSubarraySum(arr)); // Output: 1122
    }
}
