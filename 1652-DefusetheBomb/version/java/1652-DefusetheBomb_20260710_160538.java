// Last updated: 7/10/2026, 4:05:38 PM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int N = code.length;
4        int[] res = new int[N];
5        
6        for (int i = 0; i < N; i++) {
7            if (k > 0) {
8                for (int j = i + 1; j < i + 1 + k; j++) {
9                    res[i] += code[j % N];
10                }
11            } else if (k < 0) {
12                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
13                    res[i] += code[((j % N) + N) % N];
14                }
15            }
16        }
17        
18        return res;
19    }
20}