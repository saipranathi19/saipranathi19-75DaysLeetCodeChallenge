class Solution {
    public int search(int[] nums, int key)
    {
        int low = 0 ,high = nums.length-1;

        while(low <=high)
        {
            int mid = (low+high) >>1;

            if(nums[mid] ==key)
                return mid;

            if(nums[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}