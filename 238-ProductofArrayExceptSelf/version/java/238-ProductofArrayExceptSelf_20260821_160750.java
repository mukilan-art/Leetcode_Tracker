// Last updated: 8/21/2026, 4:07:50 PM
1// Shrutink
2class Solution {
3    public int[] productExceptSelf(int[] nums) {
4        int ans[] = new int[nums.length];
5        int n=nums.length;
6        int suf =1;
7        int pre =1;
8        for(int i=0;i<n;i++){
9            ans[i]=pre;
10          pre=pre*nums[i];
11        }
12        for(int i=n-1;i>=0;i--){
13            ans[i]=ans[i]*suf;
14            suf=suf*nums[i];
15        }
16        return ans;
17
18
19    }
20}