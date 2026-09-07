// Last updated: 9/7/2026, 4:25:17 PM
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