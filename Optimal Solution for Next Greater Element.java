import java.util.*;
class Main
{
public static int[]Solution(int[] array)
{
     int[] a=new int[array.length];
     int k=0;
     Arrays.fill(a,-1);
 for(int i=0;i<array.length;i++)   
 {
    for(int j=i+1;j<array.length;j++)
    {
        if(array[j]>array[i])
        {
            a[i]=array[j];
            break;
        }
    }
 }
 return a;
}
public static void main(String[] args)
{
  int[] array={4,5,2,10,8};
  System.out.print(Arrays.toString(Solution(array)));
}
}
