// Last updated: 7/9/2026, 9:46:30 AM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p1=nums[n-1]*nums[n-2]*nums[n-3];
        int p2=nums[n-1]*nums[0]*nums[1];
        if(p1>p2)
        {
            return p1;
        }
        else
        {
            return p2;
        }
    }
}