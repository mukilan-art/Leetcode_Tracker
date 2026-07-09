// Last updated: 7/9/2026, 9:47:21 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  
        }
        return ans;    
    }
}