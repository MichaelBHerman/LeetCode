class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWordCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            int spaceCount = 1;
            char[] arr = sentences[i].toCharArray();
            for (char c : arr) {
                if (c == ' ') {
                    spaceCount++;
                }
            }
            maxWordCount = Math.max(maxWordCount, spaceCount);
        }
        return maxWordCount;
    }
}