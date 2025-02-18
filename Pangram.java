import java.util.*;
class Main{
   public static boolean Solution(String s) 
   {
       s=s.toLowerCase();
      HashSet<Character>set=new HashSet<>();
      for(char ch:s.toCharArray())
      {
          if(Character.isLetter(ch))
          {
              set.add(ch);
          }
      }
      return set.size()==26;
   }
   public static void main(String[] args)
   {
      String s="The quick brown fox jumps over the lazy dog";
      System.out.print(Solution(s) ?"Pangram":"Not a Pangram");
   }
}
