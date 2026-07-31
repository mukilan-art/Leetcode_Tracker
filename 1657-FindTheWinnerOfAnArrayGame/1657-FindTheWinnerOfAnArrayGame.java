// Last updated: 7/31/2026, 9:30:39 AM
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