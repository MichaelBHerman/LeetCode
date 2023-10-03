class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int operationCount = 0;
        List<Integer> range = new ArrayList<>();
        List<Integer> numsCollected = new ArrayList<>();
        int i = 1;
        while (i <= k) {
            range.add(i);
            i++;
        }
        System.out.println(range);
        for (int j = nums.size() - 1; j >= 0; j--) {
            if (!numsCollected.contains(nums.get(j))) {
                if (range.contains(nums.get(j))) {
                    numsCollected.add(nums.get(j));
                }
            }
            operationCount++;
            Collections.sort(numsCollected);
            if (numsCollected.equals(range)) {
                return operationCount;
            }
        }
        return operationCount;
    }
}