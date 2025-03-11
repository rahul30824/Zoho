import java.util.*;
class Main{
public static int []Solution(int[] id,int[] deadline,int[]profit)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int maxindex1=-1;
        int maxindex2=-1;
     for(int i=0;i<=profit.length-1;i++){
         if(profit[i]>first)
         {
             second=first;
             first=profit[i];
             maxindex1=i;
         }
         else if (profit[i]>second)
         {
             second=profit[i];
             maxindex2=i;
         }
     }
         return new int[] {deadline[maxindex1],profit[maxindex1]+profit[maxindex2]};
    }
    public static void main(String[] args)
    {
       int[] id={1,2,3,4,5};
       int[] deadline={2,1,2,1,1};
       int[] profit={100,19,27,25,15};
      System.out.print(Arrays.toString(Solution(id,deadline,profit)));
       
    }
}
