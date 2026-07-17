// Last updated: 7/17/2026, 2:29:46 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                 max=nums[i];
                 index=i;

            }
        }
        return index;
    }
}