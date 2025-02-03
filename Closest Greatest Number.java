class Main{
    public static int []Solution(int[] array)
    {
        int big=-1;
        for(int i=0;i<array.length;i++)
        {
          for(int j=0;j<array.length;j++)
          {
              if(array[j]>array[i])
              {
                  if(big==-1||big>array[j])
                  {
                      big=array[j];
                  }
              }
          }
    if (big == -1){
        System.out.print(array[i]+ "->,");}
    else{
    System.out.print(array[i] + "->" +big+",");
    }
        }
        return array;
    }
    public static void main(String[] args)
    {
        int []array={8,4,1,9,6,2};
        Solution(array);
    }
}
