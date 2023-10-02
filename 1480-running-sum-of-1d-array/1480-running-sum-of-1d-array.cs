public class Solution {
    public int[] RunningSum(int[] nums)
        {
            int[] ans = new int[nums.Length];
            int runningSum = 0;

            for (int i = 0; i < nums.Length; i++)
            {
                runningSum += nums[i];
                ans[i] = runningSum;
            }
            return ans;
        }
}