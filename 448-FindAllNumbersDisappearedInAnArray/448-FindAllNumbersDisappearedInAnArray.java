// Last updated: 7/9/2026, 9:46:39 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int[] hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]+=1;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(hash[i]<=0)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}