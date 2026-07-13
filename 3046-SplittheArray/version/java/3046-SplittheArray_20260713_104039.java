// Last updated: 7/13/2026, 10:40:39 AM
1class Solution {
2    public boolean isPossibleToSplit(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5
6            int count = 0;
7
8            for (int j = 0; j < nums.length; j++) {
9
10                if (nums[i] == nums[j]) {
11                    count++;
12                }
13            }
14
15            if (count > 2) {
16                return false;
17            }
18        }
19
20        return true;
21    }
22}