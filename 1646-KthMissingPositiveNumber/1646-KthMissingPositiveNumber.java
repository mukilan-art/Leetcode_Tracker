// Last updated: 7/31/2026, 9:30:41 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;

        for(int num:arr){
            if(num<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}