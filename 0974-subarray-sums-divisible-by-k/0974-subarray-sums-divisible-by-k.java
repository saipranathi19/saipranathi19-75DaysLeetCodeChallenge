class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int s=0,c=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums)
        {
            s+=num;
            int rem = s % k;
            if(rem<0) rem+=k;
            if (map.containsKey(rem)) {
                c += map.get(rem);
            }
             map.put(rem, map.getOrDefault(rem, 0) + 1);

        }
        return c;
    }
}