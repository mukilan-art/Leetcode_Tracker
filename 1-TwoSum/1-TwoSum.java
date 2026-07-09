// Last updated: 7/9/2026, 9:47:58 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int []{};
    }
}