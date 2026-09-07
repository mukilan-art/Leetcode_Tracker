// Last updated: 9/7/2026, 4:26:47 PM
class Solution {
    public int getWinner(int[] arr, int k) {
        int winCount = 0;
        int winner = arr[0];
        for(int i=1; i<arr.length; i++){
            if(winner < arr[i]) {
                winner = arr[i];
                winCount = 1;
            }
            else {
                winCount++;
            }

            if(winCount >= k) return winner;
        }
        return winner;
    }
}