// Last updated: 7/20/2026, 2:05:30 PM
1class Solution {
2    public boolean canBeEqual(int[] target, int[] arr) {
3        Arrays.sort(target);
4        Arrays.sort(arr);
5        return Arrays.equals(target,arr);
6    }
7}