import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class Main{
    public static void Solution(int[] array)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:array)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
    PriorityQueue<Map.Entry<Integer,Integer>>maxHeap=new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
     maxHeap.addAll(map.entrySet());
     int count=0;
     while (count < 3 && !maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            System.out.print(entry.getKey() + " ");
            count++;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
  int[] array = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};   Solution(array);
    }
}
