import java.util.*;

class Solution {
public static  List<Integer> frequencyCount(int[] arr) {
    
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();

       for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }
    List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(freqMap.getOrDefault(i, 0));
        }
return  result;

}
public static void main(String[] args) {

        int[] arr= {2, 3, 2, 3, 5};
System.out.println((frequencyCount(arr)));
    }
}
