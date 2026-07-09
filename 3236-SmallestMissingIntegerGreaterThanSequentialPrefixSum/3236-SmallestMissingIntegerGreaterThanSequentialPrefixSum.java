// Last updated: 7/9/2026, 9:45:37 AM
class Solution {
    public int missingInteger(int[] nums) {
        int prefSum=nums[0];
        int j=1;
        int n=nums.length;
        while(j<n && (nums[j]==nums[j-1]+1)){
            prefSum+=nums[j];
            j+=1;
        }
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=0;i<n;i++){
            if(st.contains(prefSum)){
                prefSum+=1;
            }else{
                return prefSum;
            }
        }
        return prefSum;
    }
}