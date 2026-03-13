class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int com = target - nums[i];
            if(m.containsKey(com))
            {
                return new int[]{m.get(com),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}