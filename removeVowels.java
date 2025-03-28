import java.util.*;
class Main
{
public static String Solution(String str){
    HashSet<Character>set=new HashSet<>();
    StringBuilder result=new StringBuilder();
  for (char ch : str.toCharArray()) {
            // ✅ Check if ch is NOT a vowel before adding
            if ("aeiouAEIOU".indexOf(ch) == -1) { 
                set.add(ch);
            }
        }
  for(char num1:set)
  {
      result.append(num1);
  }
  return result.toString();
}

public static void main(String[] args)
{
   String str="areaihoul"; 
   System.out.print(Solution(str));
   
}
}
