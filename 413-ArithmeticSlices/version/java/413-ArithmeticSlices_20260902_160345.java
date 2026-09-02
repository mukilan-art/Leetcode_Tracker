// Last updated: 9/2/2026, 4:03:45 PM
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3        int ans=0;
4        int n=nums.length;
5        int window=2;
6        int right=2;
7        while (right<=n) {
8            if (right<n&&nums[right-1]-nums[right]==nums[right-2]-nums[right-1]) {
9                window+=1;
10                right+=1;
11            } else {
12                ans+=((window-1)*(window-2))/2;
13                window=2;
14                right+=1;
15            }
16        }
17        return ans;
18    }
19}