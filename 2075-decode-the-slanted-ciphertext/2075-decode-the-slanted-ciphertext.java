class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 0) return "";
        
        int cols = encodedText.length() / rows;
        StringBuilder result = new StringBuilder();
        
        for (int start = 0; start < cols; start++) {
            int i = start;
            
            while (i < encodedText.length()) {
                result.append(encodedText.charAt(i));
                i += cols + 1;
            }
        }
        
        // remove trailing spaces
        int end = result.length() - 1;
        while (end >= 0 && result.charAt(end) == ' ') {
            end--;
        }
        
        return result.substring(0, end + 1);
    }
}