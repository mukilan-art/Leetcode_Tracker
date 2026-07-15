// Last updated: 7/15/2026, 11:46:10 AM
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        int n=nums.length;
4       
5        while(true)
6        {
7             int count=0;
8            for(int i=0;i<n;i++)
9            {
10                if(nums[i]==original)
11                {
12                    original=original*2;
13                    count++;
14                  
15
16                }
17            }
18            if(count==0)
19        {
20            return original;
21        }
22        }
23        
24    }
25}