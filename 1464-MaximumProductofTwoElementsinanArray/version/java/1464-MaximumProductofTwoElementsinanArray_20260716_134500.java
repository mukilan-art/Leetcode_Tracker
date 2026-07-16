// Last updated: 7/16/2026, 1:45:00 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3       Arrays.sort(nums);
4       int max1=nums[nums.length-1];
5       int max2=nums[nums.length-2];
6       int m=max1-1;
7       int n=max2-1;
8       int pro=m*n;
9       return pro;
10    }
11}