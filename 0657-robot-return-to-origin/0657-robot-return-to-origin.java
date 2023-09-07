class Solution {
    public boolean judgeCircle(String moves) {
        int hPointFromOrigin = 0;
        int vPointFromOrigin = 0;
        char[] arr = moves.toCharArray();
        for (char c : arr) {
            switch (c) {
                case 'L' -> hPointFromOrigin--;
                case 'R' -> hPointFromOrigin++;
                case 'U' -> vPointFromOrigin++;
                case 'D' -> vPointFromOrigin--;
            }
        }
        return hPointFromOrigin == 0 && vPointFromOrigin == 0;
    }
}