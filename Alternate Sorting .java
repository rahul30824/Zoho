//Sort the Array Alternatively//
import java.util.Arrays;
class Main
{
public static int[] solution(int[]array)
{
   
    Arrays.sort(array);
    int end=array.length-1;
    int start=0;
    int index=0;
   int[] newarray=new int[array.length];
    while(start<=end)
    {
        if(index%2==0)
        {
            newarray[index]=array[end--];
        }
        else
        {
            newarray[index]=array[start++];
        }
        index++;
    }
    return newarray;
}
public static void main(String[] args)
{
     int [] array={1,2,3,4,5};
     System.out.print(Arrays.toString(solution(array)));
}
}
