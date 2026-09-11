// Last updated: 9/11/2026, 4:07:47 PM
class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
       int low = 0;
       int high = n - 1;
       
       while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
       }
       return -1; 
    }
}