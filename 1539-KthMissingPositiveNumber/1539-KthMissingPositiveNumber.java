// Last updated: 9/7/2026, 4:26:54 PM
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