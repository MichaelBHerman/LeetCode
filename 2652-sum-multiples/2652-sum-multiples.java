class Solution {
    public int sumOfMultiples(int n) {
        int sumOfMultiples = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sumOfMultiples += i;
                continue;
            }
            if (i % 5 == 0) {
                sumOfMultiples += i;
                continue;
            }
            if (i % 7 == 0) {
                sumOfMultiples += i;
            }
        }
        return sumOfMultiples;
    }
}