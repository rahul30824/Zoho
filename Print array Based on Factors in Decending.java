import java.util.*;

class Main {
    public static int countDivisors(int num) {
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

        // Use a list for sorting based on divisor count
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // Sort in descending order based on divisor count
        list.sort((a, b) -> countDivisors(b) - countDivisors(a));

        System.out.println("Sorted based on max divisors: " + list);
    }
}

