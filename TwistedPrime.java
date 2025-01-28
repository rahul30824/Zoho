class Main{
    public static boolean isprime(int num)
    {
        if(num<=1) return false;
        if(num==2) return true;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0){
        rev=rev*10+num%10;
        num=num/10;
            }
        return rev;
    }
    public static boolean isTwistedPrime(int num)
    {
        if (isprime(num))
        {
           int reversed= reverse(num);
           return isprime(reversed);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int num=13;
        System.out.print(isTwistedPrime(num));
    }
    
}
