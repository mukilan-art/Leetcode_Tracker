// Last updated: 7/14/2026, 10:33:32 AM
class Solution {
    public boolean stoneGame(int[] piles) {
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]==piles[piles.length-1])
            {
                return true;
            }
        }
        return false;
    }
}