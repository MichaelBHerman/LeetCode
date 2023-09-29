public class Solution {
    public int NumJewelsInStones(string jewels, string stones)
        {
            List<char> list = new List<char>();
            list.AddRange(jewels);
            int count = 0;

            char[] arr = stones.ToCharArray();
            foreach (char c in arr)
            {
                if (list.Contains(c)) {
                    count++;
                }
            }

            return count;
        }
}