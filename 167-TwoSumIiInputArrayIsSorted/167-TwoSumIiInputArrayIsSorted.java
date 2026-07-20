// Last updated: 7/20/2026, 2:06:35 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int in=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    return new int[]{i+1,j+1};

                }
            }
        }
        return new int[]{};
    }
}