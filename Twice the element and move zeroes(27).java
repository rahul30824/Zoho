import java.util.*;
class Main{
    public static int[] Solution(int[] array)
    {
        int index=0;
        for(int i=0;i<array.length-1;i++)
        {
                if(array[i]==array[i+1] )
                {
                    array[i]=array[i]*2;
                    array[i+1]=0;
                }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0)
            {
               array[index++]=array[i];
            }
        }
        while(index<array.length)
        {
            array[index]=0;
            index++;
        }
        return array;
    }
    public static void main(String[] args)
    {
        int[] array1={2,2,0,4,0,8};
       int[] array2={0,2,2,2,0,6,6,0,0,8};
        System.out.println(Arrays.toString(Solution(array1)));
        System.out.print(Arrays.toString(Solution(array2)));
       
    }
}
