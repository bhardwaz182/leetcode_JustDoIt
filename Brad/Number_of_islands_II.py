def numIslands3(m,n,positions):
    def checkForIslands(i,j,m,n):
        if i-1>=0 and grid1[i-1][j]:
            return False
        if i+1<=m-1 and grid1[i+1][j]:
            return False
        if j-1>=0 and grid1[i][j-1]:
            return False
        if j+1<=n-1 and grid1[i][j+1]:
            return False
        return True
    global grid1
    grid1 = [[0 for _ in range(n)] for i in range(m)]
    l=[]
    count=0
    for [i,j] in positions:
        grid1[i][j] = 1
        if checkForIslands(i,j,m,n):
            count+=1
            
        l.append(count)
        
    return l
