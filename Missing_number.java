class Main

{
    public static int MissingNumber(int[] array)
    {
        int n=array.length+1;//Very Important// 
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<array.length;i++)
        {
            actualsum+=array[i];
        }
    if(expectedsum==actualsum) return 0;
        return sum-actualsum;
    }
    public static void main(String[] args)
    {
       int[] array ={1,2,3,4,5,6,7};//if its contains 0 no need nums.length+1
                                       //if not  need nums.length; okei :)))
       System.out.print(MissingNumber(array));
       
    }
}
