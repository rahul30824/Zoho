public class Main{
    public static String Solution(String s)
    {
        char[] str=s.toCharArray();
        int l=0;int r=str.length-1;
        while(l<r)
        {
            if(!Character.isLetter(str[l]))
            {
                l++;
            }
            else if(!Character.isLetter(str[r]))
            {
                r--;
            }
            else{
                char temp=str[l];
                str[l]=str[r];
                str[r]=temp;
                l++;
                r--;
            }
        }
        return new String(str);
    }
    public static void main(String[] args)
    {
        String s="a&bcqi%y*i(";
        System.out.print(Solution(s));
    }
}
