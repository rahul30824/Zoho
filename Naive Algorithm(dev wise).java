class Main{
    public static int Solution(String text,String Pattern)
    {
        int count=0;
        int i=0;
      int n=text.length();
      int m=Pattern.length();
      for(i=0;i<=n-m;i++)
      {
          int j;
          for( j=0;j<m;j++)            //here j=0+0
            {                           //here j=0+1
if(text.charAt(i+j)!=Pattern.charAt(j))  //here j=0+2
    {                                    //here j=0+3
    break;
        }  
    }
    if(j==m)
    {
    System.out.println("Pattern is found at index"+i);
    count++;
    }
      }
     System.out.print(count);
    return count;
    }

    public static void main(String[] args)
    {
        String text="BCATIUIOSABCLOMABC";
        String Pattern="ABC";
        Solution(text,Pattern);
    }
}
