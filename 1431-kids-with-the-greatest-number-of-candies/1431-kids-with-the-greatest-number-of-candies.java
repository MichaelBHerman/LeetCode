class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int originalMaxCandies = 0;
        for (int n : candies) {
            originalMaxCandies = Math.max(originalMaxCandies, n);
        }
        for (int currentKidsCandies : candies) {
            if (currentKidsCandies + extraCandies >= originalMaxCandies) {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }
}