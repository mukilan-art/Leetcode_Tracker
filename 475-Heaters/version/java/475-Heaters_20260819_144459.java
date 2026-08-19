// Last updated: 8/19/2026, 2:44:59 PM
1class Solution {
2    public int findRadius(int[] houses, int[] heaters) {
3        int j=0;
4        Arrays.sort(houses);
5        Arrays.sort(heaters);
6        int max=Integer.MIN_VALUE;
7        for(int i=0;i<houses.length;i++){
8            while(j<heaters.length-1 && Math.abs(houses[i]-heaters[j+1])<=Math.abs(houses[i]-heaters[j])) j++;
9            max=Math.max(max,Math.abs(houses[i]-heaters[j]));
10        }
11        return max;
12    }
13}