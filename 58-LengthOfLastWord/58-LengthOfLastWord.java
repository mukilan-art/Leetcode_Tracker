// Last updated: 7/9/2026, 9:47:33 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] words=s.split(" ");
        String last=words[words.length-1];
        return last.length();
    }
}