// Last updated: 7/17/2026, 8:51:28 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i]==mat[j]||i+j==mat.length-1)
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}