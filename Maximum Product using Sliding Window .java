class Main{
    public static int Solution(int[] array)
    {
     int product=1;
     int i=0;
     int j=0;
     int Max=Integer.MIN_VALUE;
      for( i=0;i<=array.length-1;i++)  
      {
          product*=array[i];
          Max=Math.max(product,Max);
          
           while (j <= i && product == 0) {
                product = 1;
                j = i + 1; 
            }
          while(j<=i && product<0)
          {
              product/=array[j];
              j++;
          }
      }
      return Max;
    }
    public static void main(String[] args)
    {
       int[] array={1,2,3,4};
       System.out.print(Solution(array));
    }
}
