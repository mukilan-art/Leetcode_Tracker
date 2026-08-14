// Last updated: 8/14/2026, 3:56:19 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        int ans = 0;
5        for (int i = 0; i < n; i++) {
6            int product = 1;
7            for (int j = i; j < n; j++) {
8                product *= nums[j];
9                if (product < k) {
10                    ans++;
11                } else {
12                    break;
13                }
14            }
15        }
16        return ans;
17    }
18}