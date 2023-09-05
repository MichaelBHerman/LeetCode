class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pointFromOrigin = 0;
        char[] arr = moves.toCharArray();
        int dashCount = 0;

        for (char c : arr) {
            if (c == 'L') {
                pointFromOrigin--;
            }
            else if (c == 'R') {
                pointFromOrigin++;
            }
            else {
                dashCount++;
            }
        }
        if (pointFromOrigin < 0) {
            pointFromOrigin -= dashCount;
        }
        else  {
            pointFromOrigin += dashCount;
        }
        return Math.abs(pointFromOrigin); //we are only concerned with returning a pos integer (number of spaces either left or right of 0)
    }
}