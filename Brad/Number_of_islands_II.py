def numIslands2(m,n,positions):
    def visitedIsland(i,j,m,n):
        global grid
        grid[i][j]=0
        if i-1>=0 and grid[i-1][j]:
            visitedIsland(i-1,j,m,n)
        if i+1<=m-1 and grid[i+1][j]:
            visitedIsland(i+1,j,m,n)
        if j-1>=0 and grid[i][j-1]:
            visitedIsland(i,j-1,m,n)
        if j+1<=n-1 and grid[i][j+1]:
            visitedIsland(i,j+1,m,n)
    
    def numIslands(grid,m,n):
        count = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j]:
                    count+=1
                    visitedIsland(i,j,m,n)
        return count
    grid1 = [[0 for _ in range(m)] for i in range(n)]
    l=[]
    for val in positions:
        grid1[val[0]][val[1]] = 1
        global grid
        grid = [array[:] for array in grid1]
        l.append(numIslands(grid,m,n))
        
    return l
