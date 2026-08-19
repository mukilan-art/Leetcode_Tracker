// Last updated: 8/19/2026, 2:42:44 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int rows = matrix.length, cols = matrix[rows - 1].length;
4
5        for(int i = 0; i < rows; i++){
6            for(int j = i + 1; j < cols; j++){
7                int temp = matrix[i][j];
8                matrix[i][j] = matrix[j][i];
9                matrix[j][i] = temp;
10            }
11        }
12        int left = 0, right = cols - 1;
13        while(left < right){
14            for(int i = 0; i < rows; i++){
15                int temp = matrix[i][left];
16                matrix[i][left] = matrix[i][right];
17                matrix[i][right] = temp;
18            }
19
20            left++;
21            right--;
22        }
23    }
24}