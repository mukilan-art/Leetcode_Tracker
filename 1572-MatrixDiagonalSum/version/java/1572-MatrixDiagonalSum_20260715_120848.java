// Last updated: 7/15/2026, 12:08:48 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        for(int i=0;i<mat.length;i++)
5        {
6            for(int j=0;j<mat.length;j++)
7            {
8                if(mat[i]==mat[j]||i+j==mat.length-1)
9                {
10                    sum+=mat[i][j];
11                }
12            }
13        }
14        return sum;
15    }
16}