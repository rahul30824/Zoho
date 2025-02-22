import java.util.*;
class Main{
public static void Solution(int[] nums,int index,List<Integer>current,List<List<Integer>>result)
{
    if(index==nums.length)
    {
        result.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[index]);
    Solution(nums,index+1,current,result);
    current.remove(current.size()-1);
    Solution(nums,index+1,current,result);
}
public static void main(String[] args)
{
    int[] nums={1,2,3,4};
    List<List<Integer>>result=new ArrayList<>();
     Solution(nums,0,new ArrayList<>(),result);
     System.out.print("Combinations"+result);
    
}
}
