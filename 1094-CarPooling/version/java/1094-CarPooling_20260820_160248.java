// Last updated: 8/20/2026, 4:02:48 PM
1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3        int lengthOfTrip[] = new int[1001];
4        for (int trip[] : trips){
5            lengthOfTrip[trip[1]] += trip[0]; 
6            lengthOfTrip[trip[2]] -= trip[0]; 
7        }
8        int carLoad = 0;
9        for (int i = 0; i < 1001; i++){
10            carLoad += lengthOfTrip[i];
11            if(carLoad > capacity) return false;
12        }
13        return true; 
14    }
15}