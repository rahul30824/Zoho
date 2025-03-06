import java.util.*;
class Main
{
/*method prints the given pattern in a single line */
	public static void  printPattern(String s)
	{
	    char[] ch=s.toCharArray();
	    int i=0;
	    List<Character>set =new ArrayList<>();
	    int j=ch.length-1;
	    int mid=i+(j-i)/2;
	    for( i=mid;i<=ch.length-1;i++)
	    {
	        set.add(ch[i]);
	    for (char c : set) {
                System.out.print(c);
            }
	        System.out.print("$"+" ");
	    }
	     for( i=0;i<mid;i++)
	    {
	        set.add(ch[i]);
	    for (char c : set) {
                System.out.print(c);
            }
	        System.out.print("$"+" ");
	    }
	   
    }
    public static void main(String[] args)
    {
        String s="PROGRAM";
        printPattern(s);
        
    }
}
