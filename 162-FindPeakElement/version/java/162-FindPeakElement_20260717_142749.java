// Last updated: 7/17/2026, 2:27:49 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int max=nums[0];
4        int index=0;
5        for(int i=0;i<nums.length;i++)
6        {
7            if(nums[i]>max)
8            {
9                 max=nums[i];
10                 index=i;
11
12            }
13        }
14        return index;
15    }
16}