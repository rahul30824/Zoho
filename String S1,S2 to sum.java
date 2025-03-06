class Main{
    public static String Solution(String s1,String s2)
    {
       int num1=Integer.parseInt(s1);
       int num2=Integer.parseInt(s2);
       
       int sum=num1+num2;
       return String.valueOf(sum);
    }
    public static void main(String[] args)
    {
        String s1="25";
        String s2="23";
        System.out.print(Solution(s1,s2));
    }
}
