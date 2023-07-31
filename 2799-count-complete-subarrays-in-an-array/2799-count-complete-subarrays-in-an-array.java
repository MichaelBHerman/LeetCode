class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int completeSubArrayCount = 0;
        HashSet<Integer> set =new HashSet<>();
        for(int n :nums) {
            set.add(n);
        }
        int distinctElements = set.size();
        
        for(int i = 0; i < nums.length; i++) {
            HashSet<Integer> set2 =new HashSet<>();
            for(int j = i; j < nums.length; j++){
                set2.add(nums[j]);
                if(set2.size()==distinctElements){
// As the condition hits, left all subarrays will also satisfy the condition, so add (nums.length-j) and then break.  
                    completeSubArrayCount += nums.length - j;
                    break;
                }
            }
        }
        return completeSubArrayCount;
    }
}