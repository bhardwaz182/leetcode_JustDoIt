class Max_Area_of_Land {
    int temp_area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                    temp_area = 1;
                    traverse(grid,i,j);
                    if(temp_area > max_area)
                        max_area = temp_area;
                }
            }
        }

        return max_area;
        
    }
    public void traverse(int [][] grid,int i ,int j){
        
        if(i < (grid.length - 1) && grid[i+1][j] == 1){
            temp_area = temp_area + 1;
            grid[i+1][j] = 0;
            traverse(grid,i+1,j);
        }

        if(j < (grid[0].length - 1) && grid[i][j+1] == 1){
            temp_area = temp_area + 1;
            grid[i][j+1] = 0;
            traverse(grid,i,j+1);
        }

        if(i >= 1 && grid[i-1][j] == 1){
            temp_area = temp_area + 1;
             grid[i-1][j] = 0;
            traverse(grid,i-1,j);
        }

        if(j >= 1 && grid[i][j-1] == 1){
            temp_area = temp_area + 1;
            grid[i][j-1] = 0;
            traverse(grid,i,j-1);
        }
        
        return;
    }
    }