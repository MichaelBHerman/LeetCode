class Solution {
     public int numJewelsInStones(String jewels, String stones) {
        List<Character> jewelsList = new ArrayList<>();
        char[] arr = jewels.toCharArray();
        for (char c : arr) {
            jewelsList.add(c);
        }
        char[] arr2 = stones.toCharArray();
        int stoneJewelCount = 0;
        for (char d : arr2) {
            if (jewelsList.contains(d)) {
                stoneJewelCount++;
            }
        }
        return stoneJewelCount;
    }
}