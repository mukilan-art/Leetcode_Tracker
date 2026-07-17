// Last updated: 7/17/2026, 2:42:54 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int in=0;
4        for(int i=0;i<numbers.length;i++)
5        {
6            for(int j=i+1;j<numbers.length;j++)
7            {
8                if(numbers[i]+numbers[j]==target)
9                {
10                    return new int[]{i+1,j+1};
11
12                }
13            }
14        }
15        return new int[]{};
16    }
17}