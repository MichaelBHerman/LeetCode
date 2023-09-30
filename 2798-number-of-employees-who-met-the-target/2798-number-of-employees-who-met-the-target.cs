public class Solution {
    public int NumberOfEmployeesWhoMetTarget(int[] hours, int target)
        {
            int metTargetCount = 0;
            foreach (int n in hours)
            {
                if (n >= target)
                {
                    metTargetCount++;
                }
            }
            return metTargetCount;
        }
}