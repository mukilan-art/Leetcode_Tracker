// Last updated: 9/7/2026, 4:27:14 PM
class Solution {
    public int maxProduct(int[] nums) {
       Arrays.sort(nums);
       int max1=nums[nums.length-1];
       int max2=nums[nums.length-2];
       int m=max1-1;
       int n=max2-1;
       int pro=m*n;
       return pro;
    }
}