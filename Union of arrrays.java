import java.util.*;
class Main{
    public static  int Solution(int[] array,int[] array2)
    {
        HashSet<Integer>list=new HashSet<>();
        for(int nums:array)
        {
            list.add(nums);
        }
        for(int nums:array2){
            list.add(nums);
        }
        return list.size();
        
    }
    public static void main(String[] args){
        int[]array={1,2,3,4,5};
        int[] array2={4,5,6};
        System.out.print(Solution(array,array2));
        
    }
}
