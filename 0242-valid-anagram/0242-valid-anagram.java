class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] a = new char[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;

        }
        for(char n:a)
        {
            if(n!=0)
            return false;
        }
        return true;
    }
}