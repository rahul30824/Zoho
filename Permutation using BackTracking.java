import java.util.*;
class Main{
    public static void Solution(int[] array,int index,List<List<Integer>>result)
    {
       if(index==array.length) 
       {
          ArrayList<Integer>perm=new ArrayList<>();
          for(int num:array) perm.add(num);
          result.add(perm);
          return;
       }
       for(int i=index;i<array.length;i++)
       {
           swap(array,index,i);
           Solution(array,index+1,result);
           swap(array,index,i);
           
       }
    }
    public static void swap(int [] array,int i,int j)
    {
       int temp=array[i];
       array[i]=array[j];
       array[j]=temp;
       
    }
    public static void main(String[] args)
    {
        int[] array={1,2,4};
        List<List<Integer>>result=new ArrayList<>();
        Solution(array,0,result);
        System.out.print(result);
    }
}
