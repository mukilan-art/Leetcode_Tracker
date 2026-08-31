// Last updated: 8/31/2026, 9:26:41 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        StringBuilder res = new StringBuilder();
5        for (int i = words.length - 1; i >= 0; i--) {
6            res.append(words[i]);
7            if (i != 0) {
8                res.append(" ");
9            }
10        }
11        return res.toString().trim();
12    }
13}