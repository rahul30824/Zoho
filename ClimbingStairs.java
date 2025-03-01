class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;  // Only 1 way to climb 1 step
        }

        int[] step = new int[n + 1];  // Rename dp to step
        step[0] = 1;  // 1 way to stay on the ground
        step[1] = 1;  // 1 way to reach the first step

        for (int i = 2; i <= n; i++) {
            step[i] = step[i - 1] + step[i - 2];  // Sum of ways to reach i-1 and i-2
        }

        return step[n];  // Return the number of ways to reach step n
    }
}
