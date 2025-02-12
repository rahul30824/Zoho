import java.util.*;
class Main {
    public static HashSet<Character>Solution(int[] array) {
    HashSet<Character>set=new HashSet<>();
        for (int num : array) {
            String rahul = String.valueOf(num);  
          for(int i=0;i<rahul.length();i++)
          {
              char digit=rahul.charAt(i);
              if(!set.contains(digit))
              {
                  set.add(digit);
              }
          }
        }
     return set; 
    }
    public static void main(String[] args) {
        int[] array = {131,11,48};
        System.out.println(Solution(array));  
    }
}
