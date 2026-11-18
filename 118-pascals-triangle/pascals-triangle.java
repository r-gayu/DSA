class Solution {
    public List<List<Integer>> generate(int numRows) {
        //for int i=1 -> [1] i=j
        //int i=2 -> [1,1]     first and last =1 inbetween index = add adj index values 
        //int i=3 -> [1,2,1]
        //int i=4 -> [1,3,3,1]
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int sum = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    row.add(sum);
                }
            }
            res.add(row);
        }
        return res;
    }
}