// Last updated: 7/20/2026, 3:04:58 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3      if(s.length()!=t.length())
4      {
5        return false;
6      }
7      char[] a=s.toCharArray();
8      char[] b=t.toCharArray();
9      Arrays.sort(a);
10      Arrays.sort(b);
11      for(int i=0;i<a.length;i++)
12      {
13        if(a[i]!=b[i])
14        {
15            return false;
16        }
17      }
18      return true;
19    }
20}