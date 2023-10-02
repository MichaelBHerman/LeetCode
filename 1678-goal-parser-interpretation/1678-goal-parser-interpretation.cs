public class Solution {
    public string Interpret(string command)
        {
            string deciphered = "";
            char[] arr = command.ToCharArray();
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] == 'G')
                {
                    deciphered += 'G';
                }
                else if (arr[i] == '(' && arr[i + 1] == ')')
                {
                    deciphered += 'o';
                }
                else if (arr[i] == 'a' && arr[i + 1] == 'l')
                {
                    deciphered += "al";
                }
            }
            Console.WriteLine(deciphered);
            return deciphered;
        }
}