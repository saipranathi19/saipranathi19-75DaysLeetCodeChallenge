class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums)
        {
            max = Math.max(max,num);
            min = Math.min(min,num);
            h.add(num);
        }
        List<Integer> a = new ArrayList<>();
        for(int i=min+1;i<max;i++)
        {
            if(!h.contains(i))
            {
                a.add(i);
            }
        }
        return a;
    }
}