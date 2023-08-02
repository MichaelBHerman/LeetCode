class Solution {
    public int countCompleteSubarrays(int[] nums) {
       int distinctElements = 0;
       int completeSubarrayCount = 0;
       HashSet<Integer> set = new HashSet<>();
       for (int n : nums) {
           set.add(n);
       }
       distinctElements = set.size();

       for (int i = 0; i < nums.length; i++) {
           HashSet<Integer> set2 = new HashSet<>();
           for (int j = i;  j < nums.length; j++) {
               set2.add(nums[j]);
               if (set2.size() == distinctElements) {
                   completeSubarrayCount += nums.length - j;
                   break;
               }
           }
       }

       return completeSubarrayCount;
    }
}