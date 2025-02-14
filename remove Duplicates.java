import java.util.*;

class Main {
    
    public static int[] Solution(int[] array) {
        int j=0;  
        HashSet<Integer> set = new HashSet<>();
        
        // Traverse through the array and add unique elements to the set
        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);  // Add to set if not already present
                array[j++] = num;  // Add to newarr and increment the index
            }
        }
        
        // Return only the part of the array that contains unique elements
        return Arrays.copyOf(array, j);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
        System.out.println(Arrays.toString(Solution(array)));  // Output unique elements
    }
}
