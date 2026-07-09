// Last updated: 7/9/2026, 9:47:02 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i =0; i < nums.length; i++){
            int value = map.get(nums[i]);
            if(value > 1){
                return true;
            }
        }
        return false;
    }
}