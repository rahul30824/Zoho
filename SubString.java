class Main{
    public static Boolean SubString(String A,String B)
    {
       if(A.contains(B))
       {
           return true;
       }
       return false;
    }
    public static void main(String[] args)
    {
        String A="ABCDEFGHI";
        String B="ABC";
        System.out.print(SubString(A,B));
    }
}
