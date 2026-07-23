// Last updated: 7/23/2026, 2:47:03 PM
1class Solution {
2    public int getWinner(int[] arr, int k) {
3        int winCount = 0;
4        int winner = arr[0];
5        for(int i=1; i<arr.length; i++){
6            if(winner < arr[i]) {
7                winner = arr[i];
8                winCount = 1;
9            }
10            else {
11                winCount++;
12            }
13
14            if(winCount >= k) return winner;
15        }
16        return winner;
17    }
18}