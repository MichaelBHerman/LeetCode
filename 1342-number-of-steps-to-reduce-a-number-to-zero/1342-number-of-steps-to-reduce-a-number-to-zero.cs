public class Solution {
    public int NumberOfSteps(int num)
        {
            int stepsCount = 0;
            while (num > 0)
            {
                if (num % 2 == 0)
                {
                    num = num / 2;
                }
                else
                {
                    num -= 1;
                }
                stepsCount++;
            }
            return stepsCount;
        }
}