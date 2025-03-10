import java.util.*;
class Main{
    public static List<Integer> Solution(int [] array)
    {
        int maxsum=-1,currentsum=0;
        List<Integer>currentsubarray=new ArrayList<>();
        List<Integer>maxsubarray=new ArrayList<>();
        for(int nums:array)
        {
            if(nums>=0){
            currentsum+=nums;
            currentsubarray.add(nums);
            }
    else{
    if(currentsum> maxsum ||currentsum==maxsum &&currentsubarray.size() >maxsubarray.size())
    {
       maxsum=currentsum;
       maxsubarray = new ArrayList<>(currentsubarray);
        
    }
        currentsum=0;
        currentsubarray.clear();
    }
    }
if (currentsum> maxsum || (currentsum == maxsum && currentsubarray.size() >maxsubarray.size())) {
maxsubarray = new ArrayList<>(currentsubarray);
        }    
            
        return maxsubarray;
    }
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,-7,2,3,6,-1,4,5,6};
        System.out.print(Solution(array));
    }
}
