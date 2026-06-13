class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,n=nums.length;
        int s =n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return s-sum;

    }
}