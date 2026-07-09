// Last updated: 7/9/2026, 9:46:02 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length-1;
        int[] ans = new int[n+1];
        int i=0;
        int j= n;
        int k=n;
        while(i<=j){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                ans[k] = nums[i]*nums[i];
                k--;
                i++;
            }else{
                ans[k] = nums[j] * nums[j];
                j--;
                k--;
            }
        }
        return ans;
    }
}