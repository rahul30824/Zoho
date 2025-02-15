class Main{
    public static boolean IsPrime(int Num)
    {
       if(Num<1) 
       {
           return false;
       }
       if(Num==2)
       {
           return true;
       }
       for(int i=2;i*i<=Num;i++)
       {
           if(Num%i==0)
           {
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args)
    {
     int Num=17;
     System.out.print(IsPrime(Num));
    }
}





class Main{
    public static boolean Solution(int num)
    {
       if(num<=1)
       {
           return false;
       }
        if(num==2)
       {
           return true;
       }
      for(int i=2;i*i<=num;i++)
      {
          if(num%i==0)
          {
              return false;
          }
      }
      return true;
    }
    
    public static void main(String[] args)
    {
        int[] array={5,21,7,26,7,21};
       for(int num:array)
       {
           boolean result=Solution(num);
           System.out.println(result);
       }
    }
}
