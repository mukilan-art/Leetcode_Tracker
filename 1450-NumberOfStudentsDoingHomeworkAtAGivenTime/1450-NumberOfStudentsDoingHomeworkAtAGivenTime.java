// Last updated: 9/7/2026, 4:27:18 PM
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