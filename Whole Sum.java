class Main{
    public static void main(String[] args)
    {
        int Sum=0;
        int [][]Matrix={
        {1,2,3,4},
        {4,5,6,7},
        {8,9,10,11}
            
        };
        for(int i=0;i<Matrix.length;i++)
        {
            
            for(int j=0;j<Matrix[i].length;j++)
            {
               Sum+=Matrix[i][j];
            }
             
    }
      System.out.print(Sum);
        }
        
       
        
}
