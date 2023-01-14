class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        m = len(grid)
        n = len(grid[0])

        def visitIsland(i,j,m,n):
            grid[i][j]=0
            if i-1>=0 and grid[i-1][j]=="1":
                visitIsland(i-1,j,m,n)
            if i+1<=m-1 and grid[i+1][j]=="1":
                visitIsland(i+1,j,m,n)
            if j-1>=0 and grid[i][j-1]=="1":
                visitIsland(i,j-1,m,n)
            if j+1<=n-1 and grid[i][j+1]=="1":
                visitIsland(i,j+1,m,n)
            
        count=0
        for i in range(m):
            for j in range(n):
                if grid[i][j]=="1":
                    count+=1
                    visitIsland(i,j,m,n)
        return count
