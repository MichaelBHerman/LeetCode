public class Solution {
    public int MostWordsFound(string[] sentences)
        {
            int wordCount = 1;
            int maxWordCount = 1;
            for (int i = 0; i < sentences.Length; i++)
            {
                wordCount = 1;
                char[] arr = sentences[i].ToCharArray();
                foreach (char c in arr)
                {
                    
                    if (c == ' ')
                    {
                        wordCount++;
                    }
                }
                maxWordCount = Math.Max(wordCount, maxWordCount);
            }
            return maxWordCount;
        }
}