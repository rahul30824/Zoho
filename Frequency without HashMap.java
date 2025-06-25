class Main
{
public static void Method(int[]array)  
{
    boolean[]visit=new boolean [array.length];
  for(int i=0;i<array.length;i++)  
  {
      if(!visit[i])
      {
         int  count=1;
    for(int j=i+1;j<array.length;j++)
    {
        if(array[i]==array[j])
        {
        count++;
        visit[j]=true;
        }
    }
      System.out.println(array[i]+" "+count);
  }
}
}
public static void main(String[] args)
{
  int[] array={1,2,3,4,5,5};
  Main obj=new Main();
  obj.Method(array);
}
}
