import java.util.Random;

public class FisherYatesShuffle {
    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Generate a random index in range [0, i]
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        shuffleArray(arr);

        // Print shuffled array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
