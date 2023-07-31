class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int completeSubArrayCount = 0;
        HashSet<Integer> set =new HashSet<>();
        for (int n :nums) {
            set.add(n);
        }
        int distinctElements = set.size();

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set2 =new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set2.add(nums[j]);
                if (set2.size() == distinctElements) {
// When this condition is true, all subarrays to the right will also satisfy the condition and be "complete".
// nums.length - j will equal the subarray we just verified that first met the "complete" condition, plus the remaining subarrays left.
// we know there can't possibly be more distinct characters left at this point (because we've already determined the maximum distinct characters by looping through all characters in nums and adding them so set1.  And we've hit that here at J, So any remaining iterations of J equals another subarray that meets the criteria.                   
                    completeSubArrayCount += nums.length - j;
                    break;
                }
            }
        }
        return completeSubArrayCount;
    }
}