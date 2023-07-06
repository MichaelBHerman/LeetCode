class Solution {
    public int numIdenticalPairs(int[] nums) {
        int identicalPairs = 0;
        int i = 0, j = 1;
        while (i < nums.length - 1) {
            if (nums[i] == nums[j]) {
                identicalPairs++;
                j++;
            } else {
                j++;
            }
            if (j == nums.length) {
                i++;
                j = i + 1;
            }
        }
        return identicalPairs;
    }
}