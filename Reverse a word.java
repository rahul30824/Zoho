// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String Solution( String sentence)
    {
    StringBuilder st=new StringBuilder();
  String[] words = sentence.trim().split("\\s+");
  for(int i=words.length-1;i>=0;i--)
  {
      st.append(words[i]);
      if (i != 0) st.append(" ");
  }
   return st.toString();
    }
    public static void main(String[] args)
    {
        String sentence="rahul suceed will you";
        System.out.println(Solution(sentence));
    }
    
}
