// Last updated: 9/11/2026, 4:07:35 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length-1;
        while(l<r) {
            int mid = l + (r-l) / 2;
            if(arr[mid] < arr[mid+1]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        return l;
    }
}