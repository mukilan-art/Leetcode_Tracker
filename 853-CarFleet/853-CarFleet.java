// Last updated: 9/11/2026, 4:07:33 PM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int res = 0;
       double[] timeArr = new double[target];
       for (int i = 0; i < position.length; i++)
        {
            timeArr[position[i]]= (double)(target - position[i]) / speed[i];
        }
        double prev = 0.0;
        for (int i = target-1; i >=0 ; i--)
        {
            double cur = timeArr[i];
            if (cur > prev)
            {
                prev = cur;
                res++;
            }
        }
        return res;   
    }
}