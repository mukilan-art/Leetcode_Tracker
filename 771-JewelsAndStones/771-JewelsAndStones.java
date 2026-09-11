// Last updated: 9/11/2026, 4:07:48 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                char ch1=jewels.charAt(i);
                char ch2=stones.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                }
            }
        }
        return count;
    }
}