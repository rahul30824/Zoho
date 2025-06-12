public class Main {
    public static String reverseString(String str) {
        String reversed = "";
        int i = str.length() - 1;

        while (i >= 0) {
            reversed += str.charAt(i);
            i--;
        }

        return reversed;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseString(input));
    }
}
