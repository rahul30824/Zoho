import java.util.*;
class Main{
    public static void Solution(String[] array)
    {
        Arrays.sort(array);
        for(String num:array)
        {
            System.out.println(num);
        }
    }
    public static void main(String[] args)
    {
    String[] array={"bataman","ironman","heman"};
        Solution(array);
        
    }
}
