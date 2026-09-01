// Last updated: 9/1/2026, 4:19:13 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i=words.length-1;i >=0;i--) {
            res.append(words[i]);
            if (i!=0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}