class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int maxIdxToCheck = h - n;

        for (int i = 0; i <= maxIdxToCheck; i++) {
            String substringToCheck = haystack.substring(i, i + n);
            if (substringToCheck.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}