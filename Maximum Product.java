class Main{
    public static int Solution(int[] array)
    {
        int product=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            product*=array[i];
            max=Math.max(max,product);
       if(product==0)
       {
           product=1;
       }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[]array={1,2,3,4,0,10,100};
        System.out.print(Solution(array));
        
    }
}
