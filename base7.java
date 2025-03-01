class Main{
    public static String base7(int num)
    {
       if(num==0)  return "0";
       boolean isnegative =num<0;
       StringBuilder newnum=new StringBuilder();
       while(num>0){
       newnum.append(num%7);
       num/=7;
       }
       if(isnegative) newnum.append("-");
       return  newnum.reverse().toString();
    }
    public static void main(String[] args)
    {
       int num=100;
       System.out.print(base7(num));
    }
}
