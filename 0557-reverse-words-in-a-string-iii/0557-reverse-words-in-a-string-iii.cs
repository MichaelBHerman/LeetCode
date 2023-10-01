public class Solution {
    public string ReverseWords(string s)
        {
           
            char[] arr = s.ToCharArray();
            Array.Reverse(arr);
            string reversed = new string(arr);
            string[] splitted = reversed.Split(" ");
            string properOrder = "";

            for (int i = splitted.Length - 1; i >= 0; i--)
                
            {
                if (i != splitted.Length - 1)
                {
                    properOrder += " ";
                }
                properOrder += splitted[i];
            }
        
            return properOrder;
        }
}