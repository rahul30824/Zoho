import java.util.Arrays;

public class MergeSortExample {
    
    // Merge Sort function
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {  // Base condition: When left == right, the array is already sorted
            int mid = left + (right - left) / 2;  // Find the middle point to divide the array

            // Recursively sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to combine two sorted subarrays
    public static void merge(int arr[], int left, int mid, int right) {
        // Sizes of the subarrays
        int n1 = mid - left + 1;  // Size of left subarray
        int n2 = right - mid;      // Size of right subarray

        // Create temporary subarrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // Copy data to left and right subarrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i]; // Copy from original array

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j]; // Copy from original array

        // Merge the two subarrays back into arr[]
        int i = 0, j = 0, k = left; // Initial indexes of left, right, and merged array

        while (i < n1 && j < n2) { // Compare elements from both subarrays
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i]; // Pick smaller element
                i++;
            } else {
                arr[k] = rightArr[j]; // Pick smaller element
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[], if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[], if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Main function to test the sorting algorithm
    public static void main(String args[]) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10}; // Example input
        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1); // Call Merge Sort

        System.out.println("Sorted array: " + Arrays.toString(arr)); // Output sorted array
    }
}
