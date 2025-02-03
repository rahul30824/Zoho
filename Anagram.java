
import java.util.HashMap; 
class Main{
 
        public static boolean Anagram(String s1,String s2)
        {
            HashMap<Character,Integer>map=new HashMap<>();
            for(char c:s1.toCharArray())
            {
              map.put(c,map.getOrDefault(c,0)+1);
            }
            for(char c:s2.toCharArray())
            {
             if(!map.containsKey(c)||map.get(c)==0)
             {
                 return false;
             }
                 map.put(c,map.get(c)-1);
             }
            return true;
        }
    public static void main(String[] args)
    {
      String s1="silent";
      String s2="listen";
      System.out.print(Anagram(s1,s2));
      
    }
}
