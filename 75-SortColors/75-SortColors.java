// Last updated: 9/1/2026, 4:19:23 PM
class Solution {
    public void sortColors(int[] nums) {
        int r = 0;
        int w = 0;
        int b = nums.length - 1;
        while (w <= b) {
            if (nums[w] == 1) {
                w++;
            }
            else if (nums[w] == 0) {
                int temp = nums[w];
                nums[w] = nums[r];
                nums[r] = temp;
                w++;
                r++;
            }
            else {
                int temp = nums[w];
                nums[w] = nums[b];
                nums[b] = temp;
                b--;
            }
        }
    }
}