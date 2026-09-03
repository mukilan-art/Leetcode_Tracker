// Last updated: 9/3/2026, 4:20:34 PM
1class Solution {
2    public String frequencySort(String s) {
3        StringBuilder sb = new StringBuilder();
4        int[] freq = new int[128];
5        int n = s.length();
6        for (int i = 0; i < n; i++) {
7            freq[s.charAt(i)]++;
8        }
9        while (sb.length() < n) {
10            int max = 0;
11            for (int i = 1; i < 128; i++) {
12                if (freq[i] > freq[max]) {
13                    max = i;
14                }
15            }
16            for (int i = 0; i < freq[max]; i++) {
17                sb.append((char) max);
18            }
19            freq[max] = 0;
20        }
21        return sb.toString();
22    }
23}