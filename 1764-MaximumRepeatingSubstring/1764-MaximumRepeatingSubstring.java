// Last updated: 7/9/2026, 9:45:43 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;

        while (sequence.contains(temp)) {
            count++;
            temp = temp + word;
        }

        return count;
    }
}