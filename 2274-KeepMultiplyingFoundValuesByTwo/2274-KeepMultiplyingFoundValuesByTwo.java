// Last updated: 7/17/2026, 8:51:21 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
       
        while(true)
        {
             int count=0;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==original)
                {
                    original=original*2;
                    count++;
                  

                }
            }
            if(count==0)
        {
            return original;
        }
        }
        
    }
}