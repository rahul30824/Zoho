class Main{
    public static boolean isSubSequence(String A,String B)
    {
        int i=0,j=0;
        while(i<A.length() && j<B.length())
        {
            if(A.charAt(i)==B.charAt(j))
            {
                i++;
            }
            j++;
        }
         return i == A.length();//Tif A reaches to its end it means it substring Whenever the Character matches only it will move to another character if it reaches End so we can conclude its a substring//
    }
    public static void main(String[] args)
    {
        String A="ABC";
        String B="ABCDEFJ";
        System.out.println(isSubSequence(A, B));
    }
}
