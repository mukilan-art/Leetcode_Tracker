// Last updated: 7/15/2026, 9:39:28 AM
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=0;
4        for(int i=0;i<sentences.length;i++)
5        {
6            String[] word=sentences[i].split(" ");
7            int count=word.length;
8            if(count>max)
9            {
10                max=count;
11            }
12        }
13        return max;
14    }
15}