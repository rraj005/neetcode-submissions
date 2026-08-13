class Solution {

    private int[] manacher(String s) {
        // Build string
        StringBuilder t = new StringBuilder("#");
        for(char c: s.toCharArray()) {
            t.append(c).append("#");
        }

        // Build p array
        int n = t.length();
        int[] p = new int[n];
        int l = 0, r = 0;

        for(int i = 0; i < n; i++) {
            p[i] = (i < r) ? Math.min(r - i, p[r + l - i]) : 0;
            
            // Expand both sides till chars match
            int nextL = i - p[i] - 1;
            int nextR = i + p[i] + 1;
            while (nextL >= 0 && nextR < n && t.charAt(nextL) == t.charAt(nextR)) {
                p[i]++;
                nextL = i - p[i] - 1;
                nextR = i + p[i] + 1;
            }

            // Check for increased length
            if (i + p[i] > r) {
                l = i - p[i];
                r = i + p[i];
            }
        }

        return p;
    }

    public int countSubstrings(String s) {
        int count = 0;
        int[] p = manacher(s);
        for(int i: p) {
            count += (i + 1)/2;
        }
        return count;
    }
}
