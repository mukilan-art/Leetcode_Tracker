// Last updated: 7/9/2026, 9:47:29 AM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int total = carry;
            if (i >= 0) total += a.charAt(i--) - '0';
            if (j >= 0) total += b.charAt(j--) - '0';
            result.append(total % 2);
            carry = total / 2;
        }
        return result.reverse().toString();
    }
}