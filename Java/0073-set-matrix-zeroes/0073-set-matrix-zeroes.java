class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        Arrays.fill(row, 0);

        int[] col = new int[matrix[0].length];
        Arrays.fill(col, 0);

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    col[j]=1;
                    row[i]=1;
                }
            }
        }
         for(int j=0;j<matrix[0].length;j++)
            {
                if(col[j]==1)
                col_zero(matrix,j);
            }
        for(int j=0;j<matrix.length;j++)
            {
                if(row[j]==1)
                row_zero(matrix,j);
            }    
        

    }
    public void col_zero(int[][] matrix,int col)
    {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][col]=0;
            }  
    }
    public void row_zero(int[][] matrix,int row)
    {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[row][j]=0;
            }  
    }
}