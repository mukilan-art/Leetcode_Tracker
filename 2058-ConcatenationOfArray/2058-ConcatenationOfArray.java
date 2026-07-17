// Last updated: 7/17/2026, 8:51:25 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[nums.length+i]=nums[i];
        }
        return arr;
    }
}