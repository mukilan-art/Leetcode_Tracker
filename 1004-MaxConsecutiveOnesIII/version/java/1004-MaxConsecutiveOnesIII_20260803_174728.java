// Last updated: 8/3/2026, 5:47:28 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int start=0;
4        int end=0;
5        int zeros=0;
6        while(end<nums.length){
7            if(nums[end] == 0){
8                zeros++;
9            }
10            end++;
11            if(zeros>k){
12                if(nums[start] == 0){
13                    zeros--;
14                }
15                start++;
16            }
17        }
18        return end-start;
19    }
20}