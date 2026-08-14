// Last updated: 8/14/2026, 3:02:30 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int a=0,b=0;
4        for(int i=0;i<s.length();i++)
5            a+=s.charAt(i);
6        for(int i=0;i<t.length();i++)
7            b+=t.charAt(i);
8        return (char)(b-a);
9    }
10}