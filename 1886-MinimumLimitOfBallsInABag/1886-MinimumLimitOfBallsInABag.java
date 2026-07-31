// Last updated: 7/31/2026, 9:30:32 AM
class Solution {
    public int minimumSize(int[] nums, int maxOps) {
        int low=1,high=Arrays.stream(nums).max().getAsInt();
        while (low<high) {
            int mid=(low+high)/2;
            int ops=0;
            for(int n:nums){
                ops+=(n-1)/mid;
            }
            if (ops<=maxOps) high=mid;
            else low=mid+1;
        }
        return high;
    }
}