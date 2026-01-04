class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int score = 0;

        for(int i=0;i<m;i++){
            Arrays.sort(nums[i]);
        }

        for(int col=0;col<n;col++){
            int max = 0;
            for(int row = 0;row<m;row++){
                max = Math.max(max,nums[row][col]);
            }
            score+=max;
        }
        return score;
    }
}