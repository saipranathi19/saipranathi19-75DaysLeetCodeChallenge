class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0],v=0;
        for(int num:nums)
        {
            if(v==0)
            {
                v+=1;
                majority=num;
            }
            else
            if(num==majority)
            v++;
            else
            v--;
        }
        return majority;
    }
}