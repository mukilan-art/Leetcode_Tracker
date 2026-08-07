// Last updated: 8/7/2026, 3:04:42 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        int boatCount = 0;
4        Arrays.sort(people);
5        int left = 0;
6        int right = people.length - 1;
7        while(left <= right){
8            int sum = people[left] + people[right];
9            if(sum <= limit){
10                boatCount++;
11                left++;
12                right--;
13            }
14            else{
15                boatCount++;
16                right--;
17            }
18        }
19        return boatCount;
20    }
21}