class Main{
    public static int removeDuplicates(int[] array)
    {
        int j=0;
       for(int i=0;i<array.length-1;i++) 
       {
           if(array[i]!=array[i+1])
           {
              array[j++] =array[i];
           }
           
       }
       array[j++]=array[array.length-1];
       return j;
    }
public static void main(String[] args)
{
    int [] array={1,2,2,3,3,4,5,5};
    int result=removeDuplicates(array);
    for(int i=0;i<result;i++){
    System.out.print(array[i]);
    }
}
}
