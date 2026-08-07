class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t =new ArrayList<>();
        List<Integer> prev_row=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    prev_row = t.get(i-1);
                    row.add(prev_row.get(j)+ prev_row.get(j-1));
                }
            }
            t.add(row);
        }
        return t;
    }
}




