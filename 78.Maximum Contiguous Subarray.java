class Main {
    public static int Solution(int[] array) {
        int j = 0;
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currentsum += array[i];
            maxsum = Math.max(currentsum, maxsum);
            
            while (currentsum < 0) { // Fix: Reset subarray when sum goes negative
                currentsum -= array[j]; 
                j++; // Move left boundary
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] array = {1,-10000,200,200,200};
        System.out.print(Solution(array)); // Output: 13
    }
}
