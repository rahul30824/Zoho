class Main

{
    public static int MissingNumber(int[] array)
    {
        int n=array.length-1;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<n;i++)
        {
            actualsum+=array[i];
        }
    if(expectedsum==actualsum) return 0;
        return actualsum-expectedsum;
    }
    public static void main(String[] args)
    {
       int[] array ={1,2,3,4,5,6,7};
       System.out.print(MissingNumber(array));
       
    }
}
