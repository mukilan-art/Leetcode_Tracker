// Last updated: 7/14/2026, 11:45:16 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int[] arr=new int[n*2];
5        for(int i=0;i<n;i++)
6        {
7            arr[i]=nums[i];
8        }
9        for(int i=0;i<nums.length;i++)
10        {
11            arr[nums.length+i]=nums[i];
12        }
13        return arr;
14    }
15}