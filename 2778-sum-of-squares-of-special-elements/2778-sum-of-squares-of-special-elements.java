class Solution {
    public int sumOfSquares(int[] nums) {
       int n = nums.length;
       int sumOfSquares = 0;
       for (int i = 0; i < nums.length; i++) {
           if (n % (i + 1) == 0) {
               sumOfSquares += nums[i] * nums[i];
           }
       }
       return sumOfSquares;
   }
}