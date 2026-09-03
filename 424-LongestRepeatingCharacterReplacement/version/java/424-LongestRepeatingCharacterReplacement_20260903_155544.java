// Last updated: 9/3/2026, 3:55:44 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] arr = new int[26];
4        int res = 0;
5        int max = 0;
6        int l = 0;
7        for (int r = 0; r < s.length(); r++) {
8            arr[s.charAt(r) - 'A']++;
9            max = Math.max(max, arr[s.charAt(r) - 'A']);
10            if (r - l + 1 - max > k) { 
11                arr[s.charAt(l) - 'A']--;
12                l++;
13            }
14            res = Math.max(res, r - l + 1);
15        }
16
17        return res;
18    }
19}