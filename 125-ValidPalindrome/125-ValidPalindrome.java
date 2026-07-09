// Last updated: 7/9/2026, 9:47:22 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}