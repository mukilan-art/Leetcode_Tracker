// Last updated: 7/31/2026, 3:57:06 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int low=0;
4        int high=nums.length - 1;
5        while (low<high) {
6            int mid=low+(high-low)/2;
7            if (mid%2==1){
8                mid--;
9            }
10            if (nums[mid]==nums[mid+1]) {
11                low=mid+2;
12            } else {
13                high=mid;
14            }
15        }
16        return nums[low];
17    }
18}