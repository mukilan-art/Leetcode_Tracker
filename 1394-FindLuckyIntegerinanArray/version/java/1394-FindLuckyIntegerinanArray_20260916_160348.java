// Last updated: 9/16/2026, 4:03:48 PM
1class Solution {
2   public int findLucky(int[] arr) {
3        int[] nums = new int[501];
4        for(int a : arr) nums[a]++;
5        for(int i = 500;i>0;i--)
6			if(nums[i]==i) 
7            {
8            return i;
9            }
10        return -1;
11    }
12}