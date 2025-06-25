import java.util.*;
class Main {
    public static int longestAlternatingSubsequence(int[] arr) {
        if (arr.length < 2) return arr.length;

        int length = 1;
        boolean isIncreasing = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1] && !isIncreasing) {
                length++;
                isIncreasing = true;
            } else if (arr[i] < arr[i-1] && isIncreasing) {
                length++;
                isIncreasing = false;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        System.out.println(longestAlternatingSubsequence(arr)); // Output: 7
    }
}
