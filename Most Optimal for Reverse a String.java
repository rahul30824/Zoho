class Main
{
    public static String reverseString(String s)
    {
        StringBuilder reversed = new StringBuilder();
        int i = s.length() - 1;
        
        while (i >= 0)
        {
            reversed.append(s.charAt(i));
            i--;
        }
        
        return reversed.toString();
    }

    public static void main(String[] args)
    {
        String s = "abcdef";
        String reversed = reverseString(s);
        System.out.println("Reversed string: " + reversed);
    }
}
