// Last updated: 7/9/2026, 6:16:16 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        return (s + s).contains(goal);
7    }
8}