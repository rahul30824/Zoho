class Main{
public static int Solution (int[] wt,int[] val,int capacity)
{
    int max=val[0];
    int maxindex=-1;
  for(int i=0;i<=val.length-1;i++)  
  {
      if(val[i]>max)
      {
          max=val[i];
          maxindex=i;
      }
  }
  return capacity-wt[maxindex];
}
public static void main(String[] args)
{
   int[] val={1,2,3};
   int[] wt={4,5,1};
   int capacity=4;
   System.out.print(Solution(wt,val,capacity));
}
}
