// Last updated: 8/11/2026, 2:35:40 PM
1class Solution {
2    public double averageWaitingTime(int[][] customers) {
3        int n = customers.length, curTime = 0;
4        double totalTime = 0;
5        for(int i = 0; i < n; i++) {
6            if(curTime <= customers[i][0]) {
7                totalTime += customers[i][1];
8                curTime = customers[i][0] + customers[i][1];
9            } else {
10                totalTime += (curTime - customers[i][0] + customers[i][1]);
11                curTime += customers[i][1];
12            }
13        }
14        return totalTime / n;
15    }
16}