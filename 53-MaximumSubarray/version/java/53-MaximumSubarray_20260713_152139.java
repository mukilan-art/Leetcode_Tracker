// Last updated: 7/13/2026, 3:21:39 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int ans = nums[0];
4        int bestend = nums[0];
5
6        for(int i = 1; i < nums.length; i++){
7            int v1 = bestend + nums[i];
8            int v2 = nums[i];
9            bestend = Math.max(v1, v2);
10            ans = Math.max(bestend , ans);
11        }
12        return ans;
13    }
14}