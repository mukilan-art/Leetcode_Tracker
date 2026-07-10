// Last updated: 7/10/2026, 4:21:56 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int sum=0;
4        int [] result=new int[101];
5        for(int num: nums){
6            result[num]++;
7        }
8        for(int i=0;i<result.length;i++){
9            if(result[i]==1){
10                sum+=i;
11            }
12        }
13        return sum;
14      
15        
16    
17    }
18}