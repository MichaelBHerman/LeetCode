class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        for (int right = 0, left = 0; right < s.length(); right++){
            int indexOfFirstAppearance = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearance != right){
                left = indexOfFirstAppearance + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}