class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] word = new char[n];

        // Step 1: Check diagonal (important)
        for (int i = 0; i < n; i++) {
            if (lcp[i][i] != n - i) return "";
        }

        // Step 2: Build string (group same positions)
        char ch = 'a';

        for (int i = 0; i < n; i++) {
            if (word[i] == 0) { // not assigned yet
                if (ch > 'z') return ""; // only 26 letters

                // assign current group
                for (int j = i; j < n; j++) {
                    if (lcp[i][j] > 0) {
                        word[j] = ch;
                    }
                }
                ch++;
            }
        }

        // Step 3: Verify LCP matrix
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int val = 0;

                if (word[i] == word[j]) {
                    if (i + 1 < n && j + 1 < n) {
                        val = 1 + lcp[i + 1][j + 1];
                    } else {
                        val = 1;
                    }
                }

                if (lcp[i][j] != val) return "";
            }
        }

        return new String(word);
    }
}