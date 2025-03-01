import java.util.HashSet;
class Main{
    public static int Solution(int[] array)
    {
        int currentnum=1;
        int currentstreek=1;
        int longeststreak=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num:array)
        {
            set.add(num);
        if(set.contains(num-1))
        {
           currentnum=num; 
           int currentstreak=1;
        }
        while(set.contains(currentnum+1))
        {
            currentnum++;
           currentstreek++;
        }
        longeststreak=Math.max(longeststreak,currentstreek);
        
    }
     return longeststreak;
    }
   
public static void main(String[] args)
{
    int[] array={2,6,1,9,4,5,3};
     System.out.print(Solution(array));
    
}
}
