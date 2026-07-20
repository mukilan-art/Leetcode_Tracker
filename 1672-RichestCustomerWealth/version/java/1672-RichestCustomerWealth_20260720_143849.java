// Last updated: 7/20/2026, 2:38:49 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=0;
4        
5        for(int i=0;i<accounts.length;i++)
6        {
7              int sum=0;
8            for(int j=0;j<accounts[i].length;j++)
9            {
10                sum+=accounts[i][j];
11            }
12            if(sum>max)
13            {
14            max=sum;
15            }
16        }
17        return max;
18    }
19}