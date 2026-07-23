// Last updated: 7/23/2026, 2:59:44 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int n=arr.length;
4
5        for(int num:arr){
6            if(num<=k){
7                k++;
8            }else{
9                break;
10            }
11        }
12        return k;
13    }
14}