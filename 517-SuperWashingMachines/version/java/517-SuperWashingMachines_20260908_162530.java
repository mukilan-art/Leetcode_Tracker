// Last updated: 9/8/2026, 4:25:30 PM
1public class Solution {
2    public int findMinMoves(int[] machines) {
3        int n = machines.length;
4        int sum = 0;
5        for (int num : machines) {
6            sum += num;
7        }
8        if (sum % n != 0) {
9            return -1;
10        }
11        int avg = sum / n;
12        int[] leftSums = new int[n];
13        int[] rightSums = new int[n];
14        for (int i = 1; i < n; i++) {
15            leftSums[i] = leftSums[i - 1] + machines[i - 1];
16        }
17
18        for (int i = n - 2; i >= 0; i--) {
19            rightSums[i] = rightSums[i + 1] + machines[i + 1];
20        }
21        int move = 0;
22        for (int i = 0; i < n; i++) {
23            int expLeft = i * avg;
24            int expRight = (n - i - 1) * avg;
25            int left = 0, right = 0;
26            if (expLeft > leftSums[i]) {
27                left = expLeft - leftSums[i];
28            }
29            if (expRight > rightSums[i]) {
30                right = expRight - rightSums[i];
31            }
32            move = Math.max(move, left + right);
33        }
34        return move;
35    }
36}