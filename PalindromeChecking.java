class Solution {
    public boolean isPalindrome(int n) {
    int rev=0;
    int rem=0;
    int temp=n;
    int num=n%10;
    while(n!=0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(rev==temp)
    {
        return true;
    }

    return false;
    }
}
