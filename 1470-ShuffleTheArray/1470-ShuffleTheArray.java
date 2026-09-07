// Last updated: 9/7/2026, 4:27:11 PM
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