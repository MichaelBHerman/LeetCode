class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];
        int idx = 0;

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sorted[j] = nums[i];
                idx++;
                j++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                sorted[idx] = nums[j];
                idx++;
            }
        }
        return sorted;
    }
}