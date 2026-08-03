// Last updated: 8/3/2026, 5:43:04 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int r = piles.length;
        int count = 0;
        for (int i = 0; i < piles.length / 3; i++) {
            count += piles[r - 2];
            r -= 2;
        }
        return count;
    }
}