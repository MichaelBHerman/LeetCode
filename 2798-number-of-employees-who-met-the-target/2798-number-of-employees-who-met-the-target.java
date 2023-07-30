class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int targetMetCount = 0;
        for (int n : hours) {
            if (n >= target) {
                targetMetCount++;
            }
        }
        return targetMetCount;
    }
}