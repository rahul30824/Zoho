class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>Rahul:map.entrySet())
        {
            if(Rahul.getValue()==1)
            {
                return Rahul.getKey();
            }
        }
       return -1; 
    }
}
