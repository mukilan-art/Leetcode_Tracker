// Last updated: 9/11/2026, 4:07:43 PM
import java.util.Arrays;
class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int res = 0, count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0) {
                res++;  
            } else if (i == 0 || answers[i] != answers[i - 1] || count == 0) {
                res += answers[i] + 1;  
                count = answers[i];
            } else {
                count--;  
            }
        }
        return res;
    }
}