import java.util.Arrays;
class Main{
    public static int [] MoveZeroes(int[] array)
    {
        int j=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0)
            {
                array[j++]=array[i];
            }
        }
        while(j<array.length)
        {
            array[j]=0;
            j++;
        }
        return array;
    }
    
public static void main(String[] args)
{
    int[] array={0,1,3,4,5,0,9,13,0,8,0,9};
    MoveZeroes(array);
    System.out.print(Arrays.toString(array));
}
}
