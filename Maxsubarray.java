import java.util.*;
class Main{
    public static int Solution(int[] array)
    {
    int maxlength=0;
      int sum=0;
      int j=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++)  
      {
          sum+=array[i];
         int prevmax=max;
         max=Math.max(sum,max);

         if(max!=prevmax)
         {
             maxlength=i-j+1;
         }
      while(0>sum && j<=i)
      {
          sum-=array[j];
          j++;
      }
}
System.out.println("length"+" "+maxlength);
      return max;
      
    }
  public static void main(String[] args)
  {
      int[] array={1,2,7,-9,3,4};
      System.out.println(Solution(array));
 

  }
}
