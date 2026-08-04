// Last updated: 8/4/2026, 2:40:01 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int total = 0;
4        int n = rating.length;
5        for (int i = 0; i < n; i++) {
6            int rightLess = 0, rightMore = 0, leftLess = 0, leftMore = 0;
7            for (int j = i + 1; j < n; j++) {
8                if (rating[j] < rating[i]) rightLess++;
9                else if (rating[j] > rating[i]) rightMore++;
10            }
11            for (int j = 0; j < i; j++) {
12                if (rating[j] < rating[i]) leftLess++;
13                else if (rating[j] > rating[i]) leftMore++;
14            }
15            total += rightLess * leftMore + rightMore * leftLess;
16        }
17
18        return total;
19    }
20}