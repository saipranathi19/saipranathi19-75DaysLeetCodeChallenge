class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,c=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                if(sum==k)
                c++;

            }
        }
        return c;
    }
}