// Last updated: 9/7/2026, 4:29:08 PM
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