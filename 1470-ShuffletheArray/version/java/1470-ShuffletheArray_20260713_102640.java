// Last updated: 7/13/2026, 10:26:40 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] arr=new int[nums.length];
4        int index=0;
5        for(int i=0;i<n;i++)
6        {
7            arr[index]=nums[i];
8            index++;
9            arr[index]=nums[i+n];
10            index++;
11
12        }
13        return arr;
14    }
15}