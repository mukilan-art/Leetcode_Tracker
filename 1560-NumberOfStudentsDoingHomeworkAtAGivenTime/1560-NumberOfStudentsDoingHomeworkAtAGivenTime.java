// Last updated: 7/9/2026, 9:45:48 AM
class Solution
 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime)
     {
        int count=0;
        for(int i=0;i<startTime.length;i++)
        {
            if(startTime[i]<=queryTime && queryTime<=endTime[i])
            {
                count++;
            }
        }
        return count;
    }
}