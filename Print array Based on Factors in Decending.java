import java.util.*;

class Main {
    public static int CountDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {20, 12, 4, 5, 7, 19, 7};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Count divisors and store in map
        for (int num : array) {
            int count = CountDivisors(num);
            map.put(num, count);
            list.add(num);
        }

        // Convert map to a list of entries and sort by divisor count in descending order
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet()); //We are integrating the List and the Map Because we need to SORT//
        entries.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue()); 

        // Print the values in descending order based on divisor count
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.print(entry.getKey()+",");   ///here we are printing the Key alone so we are using different approach in iterating//
                                                     //Nothing we are just priting the map we need only key right so this approach//
        }
    }
}
