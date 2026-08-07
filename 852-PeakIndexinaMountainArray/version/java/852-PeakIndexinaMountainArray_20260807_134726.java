// Last updated: 8/7/2026, 1:47:26 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int l = 0, r = arr.length-1;
4        while(l<r) {
5            int mid = l + (r-l) / 2;
6            if(arr[mid] < arr[mid+1]) {
7                l = mid + 1;
8            }
9            else {
10                r = mid;
11            }
12        }
13        return l;
14    }
15}