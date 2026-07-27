// Last updated: 7/27/2026, 3:06:57 PM
1class Solution {
2    public int minimumSize(int[] nums, int maxOps) {
3        int low=1,high=Arrays.stream(nums).max().getAsInt();
4        while (low<high) {
5            int mid=(low+high)/2;
6            int ops=0;
7            for(int n:nums){
8                ops+=(n-1)/mid;
9            }
10            if (ops<=maxOps) high=mid;
11            else low=mid+1;
12        }
13        return high;
14    }
15}