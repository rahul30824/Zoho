import java.util.*;
class Main{
    public static HashMap<Integer,Integer> Solution(int[] array,int amount)
    {
  HashMap<Integer,Integer>currencycount=new  LinkedHashMap<>();
  for(int num:array)
  {
     if(amount>=num) 
     {
        currencycount.put(num,amount/num);
        amount%=num;
     }
  }
  for(Map.Entry<Integer,Integer>Rahul:currencycount.entrySet()){
      System.out.println(Rahul.getKey()+":"+Rahul.getValue());
  }
  return currencycount;
    }
    public static void main(String[] args)
    {
       int[] array={2000,500,200,100,50,20,10,5,2,1};
       int amount=2541;
       Solution(array,amount);
       
       
    }
}
