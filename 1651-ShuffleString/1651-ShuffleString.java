// Last updated: 7/9/2026, 9:45:45 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char shuffle[]=new char[n];
        for(int i=0;i<n;i++){
        shuffle[indices[i]]=s.charAt(i);
        }
        return new String (shuffle);
    }
}