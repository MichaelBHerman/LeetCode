class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int pairs = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    pairs++;
                }
                if (nums.get(i) + nums.get(j) >= target) {
                    break;
                }
            }
        }
        return pairs;
    }
}