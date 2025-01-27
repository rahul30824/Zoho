import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static int[] Sort(int[] array)
    {
        ArrayList<Integer>even_arr=new ArrayList<>();
        ArrayList<Integer>odd_arr=new ArrayList<>();
        for(int element:array)
        {
            if(element%2==0) even_arr.add(element);
            else odd_arr.add(element);
        }
        Collections.sort(odd_arr,Collections.reverseOrder());
        Collections.sort(even_arr);
        int index=0;
        for(int num:odd_arr) 
        {
          array[index++]=num;  
        }
        for(int num:even_arr)
        {
            array[index++]=num;
        }
        return array;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 5, 4, 7, 10};
        int[] result=Sort(array);
       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
