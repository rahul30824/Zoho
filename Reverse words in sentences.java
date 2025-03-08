public class Main {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        // Reverse the order of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
               reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String s = " i like this program very much ";
        String output = reverseWords(s);
        System.out.println(output); // Output: "much very program this like i"
    }
}
