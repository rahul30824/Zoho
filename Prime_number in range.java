class Main{
  public static boolean isPrime(int num)
  {
    if(num<=1) return false;
    if(num==2) return true;
    for(int i=2;i*i<=num;i++)
    {
     if(num%i==0)
     {
     return false;
     }
    }
    return true;
  }
  public static void printPrimesInRange(int start,int end)
  {
      for(int i=start;i<=end;i++)
      {
          if(isPrime(i))
          {
              System.out.print(i+" ");
          }
      }
  }
    
    public static void main(String[] args)
    {
       int start=1;
       int end=50;
System.out.println("Prime numbers in range " + start + " to " + end + ":");
        printPrimesInRange(start, end);
    }
}
