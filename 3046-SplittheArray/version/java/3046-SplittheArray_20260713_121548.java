// Last updated: 7/13/2026, 12:15:48 PM
1class Solution {
2    public boolean isPossibleToSplit(int[] nums) {
3        for(int i=0;i<nums.length;i++)
4        {
5            int count=0;
6            for(int j=0;j<nums.length;j++)
7            {
8                if(nums[i]==nums[j])
9                {
10                    count++;
11                }
12            }
13            if(count>2)
14            {
15                return false;
16            }
17        }
18        return true;
19    }
20}