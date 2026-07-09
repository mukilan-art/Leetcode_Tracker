// Last updated: 7/9/2026, 9:47:06 AM
class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while (n != 1 && n != 4) {
            sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}