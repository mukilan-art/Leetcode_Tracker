// Last updated: 8/31/2026, 4:13:56 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int r = 0;
4        int w = 0;
5        int b = nums.length - 1;
6        while (w <= b) {
7            if (nums[w] == 1) {
8                w++;
9            }
10            else if (nums[w] == 0) {
11                int temp = nums[w];
12                nums[w] = nums[r];
13                nums[r] = temp;
14                w++;
15                r++;
16            }
17            else {
18                int temp = nums[w];
19                nums[w] = nums[b];
20                nums[b] = temp;
21                b--;
22            }
23        }
24    }
25}