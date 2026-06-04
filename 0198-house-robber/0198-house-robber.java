class Solution {
    public int rob(int[] nums) {
        int p1 =0,p2=0;
        for(int num:nums)
        {
            int take = num+p2;
            int skip = p1;
            int max=Math.max(take,skip);
            p2=p1;
            p1=max;

        }
        return p1;
    }
}