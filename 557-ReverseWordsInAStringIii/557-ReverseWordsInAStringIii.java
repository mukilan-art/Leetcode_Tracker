// Last updated: 7/9/2026, 9:46:34 AM
class Solution {
    public String reverseWords(String s) {
        String[] word=s.split(" ");
        String res="";
        for(int i=0;i<word.length;i++)
        {
            for(int j=word[i].length()-1;j>=0;j--)
            {
                res+=word[i].charAt(j);
            }
            if(i!=word.length-1)
            {
                res+=" ";
            }
        }
        return res;
        
        
    }
}