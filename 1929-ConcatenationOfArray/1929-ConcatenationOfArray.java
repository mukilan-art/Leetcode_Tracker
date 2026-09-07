// Last updated: 9/7/2026, 4:26:00 PM
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