import java.util.*;
class Main{
    public static int []Solution(int[] array,int k)
    {
        int max=0;
        int[] maxarray=new int[array.length-k+1];
        for(int i=0;i<=array.length-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                max=Math.max(max,array[j]);
            }
             maxarray[i]=max;
        }
        return maxarray;
    }
    public static void main(String[] args)
    {
        int [] array={1,2,3,4,5,6,7,8,9};
        int k=3;
        System.out.print(Arrays.toString(Solution(array,k)));
    }
}
