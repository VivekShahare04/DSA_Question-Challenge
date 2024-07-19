class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i=0;i<n;i++){
            int rmin = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                rmin = Math.min(rmin,matrix[i][j]);
            }
            row.add(rmin);
        }

        for(int i=0;i<m;i++){
            int cmax = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                cmax = Math.max(cmax,matrix[j][i]);
            }
            col.add(cmax);
        }

       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==row.get(i) && matrix[i][j]==col.get(j)){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
        
    }
}