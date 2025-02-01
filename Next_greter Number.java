import java.util.Arrays;

class Main {
    public static int[] Solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean foundGreater = false;  
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    array[i] = array[j]; 
                    foundGreater = true;
                    break;  
                }
            }
            if (!foundGreater) {
                array[i] = -1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4};
        System.out.println(Arrays.toString(Solution(array)));
    }
}
