// Last updated: 7/17/2026, 8:51:42 AM
class Solution {
    public int[] beautifulArray(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int size = 1;
        while (size < n) {
            int[] temp = new int[n];
            int index = 0;
            for (int i = 0; i < size; i++) {
                int value = 2 * arr[i] - 1;
                if (value <= n) {
                    temp[index] = value;
                    index++;
                }
            }
            for (int i = 0; i < size; i++) {
                int value = 2 * arr[i];
                if (value <= n) {
                    temp[index] = value;
                    index++;
                }
            }
            arr = temp;
            size = index;
        }
        return arr;
    }
}