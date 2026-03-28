class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left=0;
        int maxWindow=0;
        int maxFreq =0;
        for(int r=0;r<s.length();r++)
        {
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(r)-'A']);
            
            if((r-left+1)-maxFreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            
            maxWindow = Math.max(maxWindow,(r-left+1));
        }
        return maxWindow;
        
    }
}