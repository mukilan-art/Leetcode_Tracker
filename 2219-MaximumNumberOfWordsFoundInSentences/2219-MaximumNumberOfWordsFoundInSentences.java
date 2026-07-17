// Last updated: 7/17/2026, 8:51:22 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] word=sentences[i].split(" ");
            int count=word.length;
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}