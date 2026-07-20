// Last updated: 7/20/2026, 9:34:30 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            if(target==nums[i])
7            {
8                return i;
9            }
10            
11        }
12        return -1;
13    }
14}