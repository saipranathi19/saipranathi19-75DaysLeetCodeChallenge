class Solution {
    public int maxProfit(int[] prices) {
        int m1=0;
        int m2 = Integer.MAX_VALUE;
        for(int price:prices)
        {
            if(price<m2)
            {
                m2=price;
            }
            int p = price-m2;
            m1=Math.max(m1,p);

        }
        return m1;
    }
}