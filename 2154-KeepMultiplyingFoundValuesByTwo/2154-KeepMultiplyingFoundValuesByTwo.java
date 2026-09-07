// Last updated: 9/7/2026, 4:25:42 PM
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