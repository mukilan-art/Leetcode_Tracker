// Last updated: 7/9/2026, 9:47:17 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            char ch = (char) ('A' + (columnNumber % 26));
            result.insert(0, ch); 
            columnNumber /= 26;
        }
        
        return result.toString();
    }
}