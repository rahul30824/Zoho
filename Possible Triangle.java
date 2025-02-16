import java.util.*;
class Main{
    public static int Solution(int[] array)
    {
     Arrays.sort(array);
     int n=array.length;
     int count=0;
     for(int i=n-1;i>=2;i--)
     {
         int left=0;
         int right=i-1;
    while(left<right)
    {
        if(array[left]+array[right]>array[i])
        {
            count+=(right-left);
            right--;
        }
        else{
            left++;
        }
    }
     }
     return count;
    }
    public static void main(String[] args)
    {
     int[] array={4,6,3,7};
     System.out.print(Solution(array));
    }
}
