// Last updated: 9/7/2026, 4:29:02 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
       for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    return nums;}
}