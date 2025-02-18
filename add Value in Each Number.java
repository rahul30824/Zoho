class Main{
    public static String Solution(int value,int target)
    {
        StringBuilder result=new StringBuilder();
        int Sum=0;
        String  num=String.valueOf(value);
        for(int i=0;i<num.length();i++)
        {
            char digit=num.charAt(i);
            int digitValue = digit - '0';
            Sum=digitValue+target;
            result.append(Sum);
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
       int value=4875; 
       int target=6;
       System.out.print(Solution(value,target));
    }
}
