class Number_of_Islands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    traverse(grid,i,j);
                }
            }
        }

        return count;
        
    }
    public void traverse(char [][] grid,int i ,int j){
        if(i < (grid.length - 1) && grid[i+1][j] == '1'){
             grid[i+1][j] = '0';
            traverse(grid,i+1,j);
        }

        if(j < (grid[0].length - 1) && grid[i][j+1] == '1'){
             grid[i][j+1] = '0';
            traverse(grid,i,j+1);
        }

        if(i >= 1 && grid[i-1][j] == '1'){
             grid[i-1][j] = '0';
            traverse(grid,i-1,j);
        }

        if(j >= 1 && grid[i][j-1] == '1'){
             grid[i][j-1] = '0';
            traverse(grid,i,j-1);
        }

        
        
        return;
    }
}
