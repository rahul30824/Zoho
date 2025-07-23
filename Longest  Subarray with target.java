class Solution {
    public int longestSubarray(int[] arr, int k) {
    int start=0;
    int sum=0;
    int length=0;
    for(int end=0;end<arr.length;end++)
    {
        sum+=arr[end];
        while(sum>k && start<=end)
        {
            sum-=arr[start];
            start++;
        }
        if(sum==k)
        {
            length=Math.max(length,end-start+1);
        }
    }
        return length;
    }
}
