// Last updated: 7/15/2026, 2:58:53 PM
1class Solution {
2    public void reverseString(char[] s) {
3
4        int left = 0;
5        int right = s.length - 1;
6
7        while (left < right) {
8
9            char temp = s[left];
10            s[left] = s[right];
11            s[right] = temp;
12
13            left++;
14            right--;
15        }
16    }
17}