class Main{
    public static int Duplicates(int[] array1,int[] array2)
    {
       int i=0;
       int j=0;
       while(i<array1.length && j<array2.length)
       {
           if(array1[i]!=array2[j])
           {
               return i;
           }
           i++;
           j++;
           
       }
       return -1;
    }
    public static void main(String[] args)
    {
       int[] array1={2,4,6,8,9,10,12};
       int[] array2={2,4,6,8,10,12};
       int i=(Duplicates(array1,array2));
System.out.print("The Duplicate Element at index"+i+"=" +array1[i]);
       
    }
}
