import java.util.*;

class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); // Size of array
            Integer[] arr = new Integer[N]; // Use Integer[] for custom sorting
            Map<Integer, Integer> freqMap = new HashMap<>();
            
            // Read input and calculate frequency
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
            
            // Sort the array based on frequency, then value
            Arrays.sort(arr, Comparator.comparingInt((Integer a) -> -freqMap.get(a)).thenComparingInt(a -> a));
            
            // Print sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
