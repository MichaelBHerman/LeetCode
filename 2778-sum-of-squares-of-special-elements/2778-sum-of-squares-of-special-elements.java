class Solution {
    public int sumOfSquares(int[] nums) {
       List<Integer> specialList = new ArrayList<>();
       int n = nums.length;
       for (int i = 0; i < nums.length; i++) {
           if (n % (i + 1) == 0) {
               specialList.add(nums[i]);
           }
       }
       System.out.println(specialList);
       int sumOfSquares = 0;
       for (int special : specialList) {
           sumOfSquares += special * special;
       }
       return sumOfSquares;
   }
}