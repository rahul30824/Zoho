class Main
{
 public static int countfrequency(int[] nums)   
 {
     int max=100;
     int[]freq=new int[max+1];
     for(int num:nums)
     {
         freq[num]++;
     }
     for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
        return -1;
 }
public static void main(String[] args)
{
  int[]nums={7,8,4,3,2,1,3,2,1,5};
   countfrequency(nums);
}
}
