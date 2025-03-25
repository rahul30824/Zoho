import java.util.*;

class Main {
    public static void findCombinations(int[] nums, int index, int sum, int target, List<Integer> tempList, List<List<Integer>> result) {
        // ✅ Base Condition: If sum matches target, add to result
        if (sum == target) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            int newSum = sum + nums[i];  // ✅ Store sum + nums[i] in a variable

            // 🚀 Pruning: If adding nums[i] exceeds target, stop further recursion
            if (newSum > target) break;  // ✅ Use 'break' if sorted

            tempList.add(nums[i]);  // Choose element
            findCombinations(nums, i, newSum, target, tempList, result); // Recurse with newSum
            tempList.remove(tempList.size() - 1);  // ❌ Undo choice (Backtrack)
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7}; // Must be sorted for pruning to work effectively
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinations(nums, 0, 0, target, new ArrayList<>(), result);
        System.out.println(result);
    }
}
