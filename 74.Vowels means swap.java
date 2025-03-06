class Main{
    public static String Solution(String str)
    {
        char[] str2=str.toCharArray();
        int i=0;
        int j=str2.length-1;
        while(i<j)
        {
           if(isVowel(str2[i]) && isVowel(str2[j])) 
           {
             swap(str2,i,j);
             i++;
             j--;
           }
           else{
               if(!isVowel(str2[i]))i++;
               if(!isVowel(str2[j]))j--;
           }
        }
        return new String(str2);
    }
    public static void swap(char[] str2,int i,int j)
    {
        char temp=str2[i];
        str2[i]=str2[j];
        str2[j]=temp;
    }
    public static boolean isVowel(char ch)
    {
        return( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
        
    public static void main(String[] args)
    {
        String str="Rahul";
        System.out.print(Solution(str));
        
        
    }
}
