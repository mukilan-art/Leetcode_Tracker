// Last updated: 7/20/2026, 1:43:37 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count = 0;
4        for(int i = 0;i<nums.length;i++){
5            if((nums[i]>=10 && nums[i]<=99) || (nums[i]>=1000 && nums[i]<=9999) || (nums[i] == 100000)){
6                count++;
7            }
8        }
9        return count;
10    }
11}