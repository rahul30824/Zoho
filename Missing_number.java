class Main{
    public static int MissingNumber(int [] array)
    {
        int sum=0;
        int n=array.length+1;
        int expectedsum=n*(n+1)/2;
        if(sum==expectedsum) return 0;
        for(int num:array)  
      {
          sum+=num;
      }
      return expectedsum- sum;
    }
    public static void main(String[] args)
    {
      int[] array={1,2,3,4,5}; 
      int result=MissingNumber(array);
      System.out.println(result);
      if(result==0)
      {
          System.out.print("No Missing number");
      }
    }
}
