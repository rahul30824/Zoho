import java.util.Scanner;
class Main2{
    public static boolean isPrime(int number)
    {
     if(number<=1) 
     {
         return false;
     }
     if(number==2)
     {
         return true;
     }
     for(int i=2;i*i<=number;i++)
     {
         if(number%i==0)
         {
             return false;
         }
     }
     return true;
    }
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
     int number=2;
    int count=0;
    while(count<n)
    {
        if(isPrime(number))
        {
            System.out.println(number);
            count++;
        }
        number++;
    }
    s.close();
}
}
        
