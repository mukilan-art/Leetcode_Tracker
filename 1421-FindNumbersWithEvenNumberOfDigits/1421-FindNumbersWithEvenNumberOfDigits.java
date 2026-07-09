// Last updated: 7/9/2026, 9:45:50 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if((nums[i]>=10 && nums[i]<=99) || (nums[i]>=1000 && nums[i]<=9999) || (nums[i] == 100000)){
                count++;
            }
        }
        return count;
    }
}