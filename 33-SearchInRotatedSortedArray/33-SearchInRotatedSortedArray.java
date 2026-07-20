// Last updated: 7/20/2026, 2:06:49 PM
class Solution {
    public int search(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
            
        }
        return -1;
    }
}