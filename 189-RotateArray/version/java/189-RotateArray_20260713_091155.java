// Last updated: 7/13/2026, 9:11:55 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k=k%n;
5        int[] arr=new int[nums.length];
6        for(int i=0;i<nums.length;i++)
7        {
8            arr[(i+k)%n]=nums[i];
9        }
10        for(int i=0;i<n;i++)
11        {
12            nums[i]=arr[i];
13        }
14        
15    }
16}