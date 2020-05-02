class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;

        int[][] sol = new int[row][col];
        sol[0][0] = grid[0][0];
        
        // fill top row
        for (int i = 0; i < col - 1; i++) {
            sol[0][i + 1] = sol[0][i] + grid[0][i + 1];
        }

        // fill left col
        for (int i = 0; i < row - 1; i++) {
            sol[i + 1][0] = sol[i][0] + grid[i + 1][0];
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                sol[i][j] = Math.min(sol[i - 1][j], sol[i][j - 1]) + grid[i][j];
            }
        }

        return sol[row - 1][col - 1];
    }
}