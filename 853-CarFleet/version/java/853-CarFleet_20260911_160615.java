// Last updated: 9/11/2026, 4:06:15 PM
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3         int res = 0;
4       double[] timeArr = new double[target];
5       for (int i = 0; i < position.length; i++)
6        {
7            timeArr[position[i]]= (double)(target - position[i]) / speed[i];
8        }
9        double prev = 0.0;
10        for (int i = target-1; i >=0 ; i--)
11        {
12            double cur = timeArr[i];
13            if (cur > prev)
14            {
15                prev = cur;
16                res++;
17            }
18        }
19        return res;   
20    }
21}