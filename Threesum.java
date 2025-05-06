import java.util.*;
class Main
{
public static List<List<Integer>>Solution(int n,int[] nums)
{
Set<List<Integer>>st=new HashSet<>();
for(int i=0;i<nums.length;i++)
{
 Set<Integer>set=new HashSet<>();
 for(int j=i+1;j<nums.length;j++)
 {
     int k=-(nums[i]+nums[j]);
     if(set.contains(k))
     {
         List<Integer>temp=Arrays.asList(nums[i],nums[j],k);
         Collections.sort(temp);
         st.add(temp);
     }
     set.add(nums[j]);
 }
}
return new ArrayList<>(st);
}
public static void main(String[] args)
{
int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = Solution(nums.length, nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
 }
}
}
