class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """

        m=len(grid)
        n=len(grid[0])
        global areaCount

        def visitedIsland(i,j,m,n):
            grid[i][j]=0
            global areaCount
            areaCount+=1
            if i-1>=0 and grid[i-1][j]:
                visitedIsland(i-1,j,m,n)
            if i+1<=m-1 and grid[i+1][j]:
                visitedIsland(i+1,j,m,n)
            if j-1>=0 and grid[i][j-1]:
                visitedIsland(i,j-1,m,n)
            if j+1<=n-1 and grid[i][j+1]:
                visitedIsland(i,j+1,m,n)
            return areaCount
        max1 = 0

        for i in range(m):
            for j in range(n):
                if grid[i][j]:
                    areaCount = 0
                    temp = visitedIsland(i,j,m,n)
                    if temp > max1:
                        max1=temp

        return max1
