import java.util.Comparator;
import java.util.Arrays;
class Main{
    public static int minPrimeFactor(int num)
    {
        if(num<=1)
        {
            return num;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return i;
            }
        }
        return num;
    }
    public static void main(String[] args)
    {
       Integer[] array={15,7,10,6,25};
    Arrays.sort(array, new Comparator<Integer>() {
    
   public int compare(Integer a, Integer b) {
    return Integer.compare(minPrimeFactor(a), minPrimeFactor(b));
            }
        });
         System.out.println("Sorted array based on minimum prime factor: " + Arrays.toString(array));
    }
}
