
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


//First recall updated Some futures//
//just add the charcaters in the HashMap and minus it from the second if it is zero it is anagram// ok??
import java.util.*;
class Main{
    public static boolean Solution(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
    HashMap<Character,Integer>map=new HashMap<>();
    for(char num:s1.toCharArray())
    {
       map.put(num,map.getOrDefault(num,0)+1);
    }
    for(char num:s2.toCharArray())
    {
        map.put(num,map.getOrDefault(num,0)-1);
    }
    for(int count:map.values())
    {
        if(count!=0) {
            return false;}
    }
    return true;
    }
    public static void main(String[] args)
    {
        String s1="listen";
        String s2="silent";
        System.out.print(Solution(s1,s2));
        
    }
}
