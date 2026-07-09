// Last updated: 7/9/2026, 9:47:57 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++)
        {
            String sub="";
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(sub.indexOf(ch)!=-1)
                {
                    break;
                }
                sub+=ch;
            }
            if(sub.length()>maxlen)
            {
                maxlen=sub.length();
            }
        }
        return maxlen;
    }
}