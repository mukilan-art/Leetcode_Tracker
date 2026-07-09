// Last updated: 7/9/2026, 9:47:38 AM
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger p=n1.multiply(n2);
        return p.toString();
        
    }
}