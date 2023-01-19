class Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){

                if(grid[i][j] == 1){

                if(((i <= (m - 2) && grid[i+1][j] == 0)) || i == (m-1))
                    perimeter++;
                if(((i >= 1 && grid[i-1][j] == 0)) || i==0)
                    perimeter++;
                if(((j >= 1 && grid[i][j-1] == 0)) || j == 0)
                    perimeter++;
                if(((j <= (n-2) && grid[i][j+1] == 0)) || j == (n-1))
                    perimeter++;       
               
                }
            }
        }
        return perimeter;
    }
}