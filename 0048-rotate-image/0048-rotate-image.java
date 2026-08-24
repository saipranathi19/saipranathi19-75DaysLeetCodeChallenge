class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reversing(matrix);
    }
    public static void transpose(int[][] matrix)
    {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        
    }
}
public void reversing(int[][] m)
{
    
    for(int i=0;i<m.length;i++)
    {
        int l=0,r=m[0].length-1;
        while(l<r)
        {
            int temp=m[i][l];
            m[i][l]=m[i][r];
            m[i][r]=temp;
            l++;
            r--;
        }
    }
}


    }
