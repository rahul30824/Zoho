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
