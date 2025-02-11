import java.util.Arrays;
import java.util.Comparator;
class Main{
    public static String Solution(int[] arr)
    {
     String[] arrstr=new String[arr.length];
     for(int i=0;i<arr.length;i++)
     {
         arrstr[i]=String.valueOf(arr[i]);
     }
     Arrays.sort(arrstr,new Comparator<String>(){

         public int compare(String a,String b)
         {
             return(b+a).compareTo(a+b);
         }
     });
      if (arrstr[0].equals("0")) {
            return "0";
        }
    StringBuilder result=new StringBuilder();
    for(String num: arrstr)
    {
        result.append(num);
    }
        return result.toString();
     }
     
    public static void main(String[] args)
    {
       int [] arr={198,3489,4847,5974};
       System.out.print(Solution(arr));
       
    }
}
