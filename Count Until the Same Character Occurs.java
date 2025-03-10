class Main {
    public static int Solution(String s) {
        char[] array = s.toCharArray();
        int i = 0, count = 0;

        // Find the first 'r'
        while (i < array.length && array[i] != 'r') {
            i++;
        }

        i++;

        // Count characters until the second 'r'
        while (i < array.length && array[i] != 'r') {
            count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "ragulrams";
        System.out.println(Solution(s)); // Expected output: 4 (for "agul")
    }
}
