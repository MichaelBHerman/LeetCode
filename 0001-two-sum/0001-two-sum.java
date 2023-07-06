class Solution {
   public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0, j = 1;
        while (i < nums.length - 1) {

            if (nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            }
            else {
                if (j == nums.length - 1) {
                    i++;
                    j = i + 1;
                }
                else {
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}