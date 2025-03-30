class Main{
public static int Solution( String s)
{
  StringBuilder vowel =new StringBuilder();
  StringBuilder consonants=new StringBuilder();
  for(char num:s.toCharArray())
  {
      if("aeiou".indexOf(num)!=-1)
      {
          vowel.append(num);
      }
      else{
          consonants.append(num);
      }
  }
 return "Vowels: " + vowel.toString() + ", Consonants: " + consonants.toString();
}
public static void main(String[] args)
{
 String s="pugalenthi";
 System.out.print(Solution(s));
 
}
}
