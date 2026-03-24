class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length-1;
        int m=0;
        while(l<r)
        {
            int w = r-l;
            int h = Math.min(height[l],height[r]);
            int a = w*h;
            m = Math.max(m,a);
            if(height[l]<height[r])
            {
                l++;

            }
            else
            r--;
        }
        return m;
    }
}