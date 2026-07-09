// Last updated: 7/9/2026, 9:46:48 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[index] = temp;
                index++;
            }
        }
    }
}