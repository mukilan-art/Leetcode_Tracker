// Last updated: 7/31/2026, 9:30:43 AM
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int min=salary[0];
        int count=0;
        int max=salary[salary.length-1];
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]!=max&&salary[i]!=min)
            {
                sum+=salary[i];
                count++;
            }
        }
        double avg=sum/count;
        return avg;
    }
}