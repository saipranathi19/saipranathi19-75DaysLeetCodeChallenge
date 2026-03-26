class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int w =0;
        for(int i=0;i<k;i++)
        w+=nums[i];
        int m = w;
        for(int i=k;i<nums.length;i++)
        {
            w+=nums[i];
            w-=nums[i-k];
            m = Math.max(m,w);
        }
        return (double)m/k;
    }
}