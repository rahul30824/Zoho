class Main{
    public static boolean isPrime(int num)
    {
       if(num<=1) return false;
       if(num==2) return true;
       for(int i=2;i*i<=num;i++)
       {
           if(num%i==0) return false;
       }
       return true;
    }
    public static int Solution(int[] arr1,int[] arr2)
    {
        int num1=arr1[0];
        int i=2;
        while(true)
        {
            if(isPrime(i))
            {
                boolean divisible=true;
            for(int num2:arr2)
            {
                if((num1+i)%num2!=0)
                {
                    divisible =false;
                    break;
                }
            }
            if(divisible) return i;
            }
            i++;
        }
    }
    public static void main(String[] args)
    {
        int[]arr1={10};
        int[] arr2={3,5};
        System.out.print(Solution(arr1,arr2));
    }
}
