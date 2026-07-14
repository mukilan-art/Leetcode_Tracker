// Last updated: 7/14/2026, 10:33:21 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++)
        {
            arr[index]=nums[i];
            index++;
            arr[index]=nums[i+n];
            index++;

        }
        return arr;
    }
}