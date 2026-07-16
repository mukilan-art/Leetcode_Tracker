// Last updated: 7/16/2026, 4:16:47 PM
1class Solution {
2    public int[] beautifulArray(int n) {
3        int[] arr = new int[n];
4        arr[0] = 1;
5        int size = 1;
6        while (size < n) {
7            int[] temp = new int[n];
8            int index = 0;
9            for (int i = 0; i < size; i++) {
10                int value = 2 * arr[i] - 1;
11                if (value <= n) {
12                    temp[index] = value;
13                    index++;
14                }
15            }
16            for (int i = 0; i < size; i++) {
17                int value = 2 * arr[i];
18                if (value <= n) {
19                    temp[index] = value;
20                    index++;
21                }
22            }
23            arr = temp;
24            size = index;
25        }
26        return arr;
27    }
28}