import java.util.*;
class Main{
    public static int nextPermutation(int [] nums)
    {
     int n=nums.length;
     int i=n-2;
     while(i>=0 && nums[i]>=nums[i+1])
     {
         i--;
     }
     return i;
    }
    public static void main(String[] args)
    {
        int[] nums={12,45,67,89,102,34};
System.out.print((nextPermutation(nums)));
        
        
    }
}
