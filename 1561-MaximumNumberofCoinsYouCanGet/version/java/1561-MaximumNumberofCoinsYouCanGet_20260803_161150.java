// Last updated: 8/3/2026, 4:11:50 PM
1class Solution {
2    public int maxCoins(int[] piles) {
3        Arrays.sort(piles);
4        int r = piles.length;
5        int count = 0;
6        for (int i = 0; i < piles.length / 3; i++) {
7            count += piles[r - 2];
8            r -= 2;
9        }
10        return count;
11    }
12}