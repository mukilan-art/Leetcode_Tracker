// Last updated: 7/20/2026, 2:15:08 PM
1class Solution {
2    public double average(int[] salary) {
3        Arrays.sort(salary);
4        int min=salary[0];
5        int count=0;
6        int max=salary[salary.length-1];
7        double sum=0;
8        for(int i=0;i<salary.length;i++)
9        {
10            if(salary[i]!=max&&salary[i]!=min)
11            {
12                sum+=salary[i];
13                count++;
14            }
15        }
16        double avg=sum/count;
17        return avg;
18    }
19}