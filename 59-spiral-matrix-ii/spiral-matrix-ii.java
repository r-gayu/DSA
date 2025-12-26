class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int i =1;
        int left = 0, right = n-1, top = 0, bottom = n-1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                mat[top][j] = i++;
            }
            top++;
                
            for(int j=top;j<=bottom;j++){
                mat[j][right] = i++;
            }
            right--;

            if(left<=right){
                for(int j=right;j>=left;j--){
                    mat[bottom][j] = i++;
                }
                bottom--;
            }

            if(top<=bottom){
                for(int j=bottom;j>=top;j--){
                    mat[j][left] = i++;
                }
                left++;
            }
        }
        return mat;
    }
}