class Main{
    public static int singleNonDuplicate(int[] nums) {
        int target = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];             }
        }

        return nums[nums.length - 1];
    }
  public static void main(String[] args)  
  {
      int[] array={1,1,2,2,4,5,5,6};
      System.out.print(singleNonDuplicate(array));
  }
}
