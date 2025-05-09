public int maxTurbulenceSize(int[] arr) {
    if (arr.length == 1) return 1;  // Single element is a turbulent subarray by default
    
    int inc = 1, dec = 1;  // Track increasing and decreasing subsequences
    int ans = 1;  // Minimum turbulent subarray length
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[i - 1]) {
            inc = dec + 1;  // Current element is greater than previous, extend the increasing subsequence
            dec = 1;        // Reset the decreasing subsequence
        } else if (arr[i] < arr[i - 1]) {
            dec = inc + 1;  // Current element is smaller than previous, extend the decreasing subsequence
            inc = 1;        // Reset the increasing subsequence
        } else {
            inc = 1;        // Reset both if elements are equal
            dec = 1;
        }
        
        // Update the maximum length of the turbulent subarray found so far
        ans = Math.max(ans, Math.max(inc, dec));
    }
    
    return ans;
}
