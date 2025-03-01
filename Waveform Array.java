import java.util.Arrays;

public class Main {
    public static void waveSort(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        
        // Step 2: Swap adjacent elements
        for (int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,10};
        waveSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
