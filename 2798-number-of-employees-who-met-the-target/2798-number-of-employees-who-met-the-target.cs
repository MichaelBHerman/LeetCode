public class Solution {
    public int NumberOfEmployeesWhoMetTarget(int[] hours, int target)
        {
            int metTargetCount = 0;
            int l = hours.Length;
            Array.Sort(hours);
    
            for (int i = 0; i < hours.Length; i++)
            {
                if (hours[i] >= target)
                {
                    metTargetCount = l - i;
                    return metTargetCount;
                }
            }
            return metTargetCount;
        }
}