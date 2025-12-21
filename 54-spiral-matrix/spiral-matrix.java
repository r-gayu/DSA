class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length;         //ROWS
        int n = mat[0].length;      //COLS

        int left = 0, right = n-1, top =0, bottom=m-1;
        List<Integer> list = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(mat[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(mat[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}