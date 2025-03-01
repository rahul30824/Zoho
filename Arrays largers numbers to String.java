import java.util.*;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        
        // Convert numbers to strings
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting based on concatenation
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: If the largest number is "0", return "0"
        if (arr[0].equals("0")) return "0";

        // Form the largest number
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr)); // Output: "9534330"
    }
}
