// Last updated: 7/31/2026, 2:58:35 PM
1class Solution {
2    public int maxProduct(String[] words) {
3        int n = words.length;
4        int[] masks = new int[n];
5        for (int i=0; i<n; i++)
6            for (char c: words[i].toCharArray())
7                masks[i] |= (1 << (c - 'a'));
8        int largest = 0;
9        for (int i=0; i<n-1; i++) 
10            for (int j=i+1; j<n; j++) 
11                if ((masks[i] & masks[j]) == 0) 
12					largest = Math.max(largest, words[i].length() * words[j].length());
13        
14        return largest;
15    }
16}