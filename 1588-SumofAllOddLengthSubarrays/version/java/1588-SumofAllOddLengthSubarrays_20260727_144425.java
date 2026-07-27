// Last updated: 7/27/2026, 2:44:25 PM
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum=0 ;
4        int count=0 ;
5        for( int i=0;i<arr.length;i++ ){
6            for( int j=i;j<arr.length;j++){
7                if( ((j-i)+1)%2!=0){
8                   for( int k=i;k<=j;k++){
9                    sum=sum+arr[k] ;
10                   }
11                }
12            }
13        }
14        return sum;
15    }
16}