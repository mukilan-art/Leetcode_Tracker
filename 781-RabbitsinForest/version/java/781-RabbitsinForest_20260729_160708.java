// Last updated: 7/29/2026, 4:07:08 PM
1import java.util.Arrays;
2class Solution {
3    public int numRabbits(int[] answers) {
4        Arrays.sort(answers);
5        int res = 0, count = 0;
6        for (int i = 0; i < answers.length; i++) {
7            if (answers[i] == 0) {
8                res++;  
9            } else if (i == 0 || answers[i] != answers[i - 1] || count == 0) {
10                res += answers[i] + 1;  
11                count = answers[i];
12            } else {
13                count--;  
14            }
15        }
16        return res;
17    }
18}