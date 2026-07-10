// Last updated: 7/10/2026, 11:36:35 AM
1class Solution {
2    public boolean stoneGame(int[] piles) {
3        for(int i=0;i<piles.length;i++)
4        {
5            if(piles[i]==piles[piles.length-1])
6            {
7                return true;
8            }
9        }
10        return false;
11    }
12}