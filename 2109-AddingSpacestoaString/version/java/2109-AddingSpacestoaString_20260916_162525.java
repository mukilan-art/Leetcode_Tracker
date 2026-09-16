// Last updated: 9/16/2026, 4:25:25 PM
1class Solution {
2    public String addSpaces(String s, int[] spaces) {
3        StringBuilder sb = new StringBuilder();
4        int j = 0;
5        for (int i = 0; i < s.length(); i++) {
6            if (j < spaces.length && i == spaces[j]) {
7                sb.append(' ');
8                j++;
9            }
10            sb.append(s.charAt(i));
11        }
12        return sb.toString();
13    }
14}