public class Solution {
    public int MinOperations(IList<int> nums, int k)
        {
            int operationsCount = 0;
            List<int> answer = new List<int>();
            

            for (int i = nums.Count - 1; i >= 0; i--)
            {
                operationsCount++;
                if (nums[i] <= k)
                {
                    if (!answer.Contains(nums[i]))
                    {
                        answer.Add(nums[i]);
                    }
                }
                if (answer.Count == k)
                {
                    break;
                }
                
            }
     
            return operationsCount;
        }
}