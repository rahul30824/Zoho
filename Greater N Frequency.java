import java.util.HashMap;
import java.util.Map;
class Main{
public static int Solution(int[] array)
    {
        int mostfrequency=-1;
        int maxfreq=3;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:array)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>Rahul:map.entrySet())
        {
            if(Rahul.getValue()> maxfreq)
            {
                 maxfreq=Rahul.getValue();
               mostfrequency=Rahul.getKey();
            }
        }
        return mostfrequency;
    }
    public static void main(String[] args)
    {
        int[] array={1,2,3,3,3,5,6,7,7,7,7,9,9,9,9};
        System.out.print(Solution(array));
        
    }
}
