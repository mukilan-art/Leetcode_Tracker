// Last updated: 7/14/2026, 4:21:10 PM
1class Solution {
2    public long findTheArrayConcVal(int[] nums) {
3        long concat = 0;
4        int len = nums.length;
5        int i = 0;
6        int j = len - 1;
7        while (i < j) {
8            int right = nums[j--];
9            concat += nums[i++] * getMultiplier(right) + right;
10        }
11        if ((len & 1) == 1) {
12            concat += nums[i];
13        }
14        return concat;
15    }
16    private int getMultiplier(int num) {
17        int multiplier = 1;
18        while (num > 0) {
19            num /= 10;
20            multiplier *= 10;
21        }
22        return multiplier;
23    }
24}