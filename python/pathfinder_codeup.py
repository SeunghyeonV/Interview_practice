# Pathfinder 
# 10 elements of nested element is given as input [[ _ _ _ _ _ _ _ _ _ _ ] * 10]
# elements with value 0 indicates available route
# elements with value 1 indicates obstacles
# elements with value 2 indicates target
# DISPLAY THE ROUTE TO THE TARGET BY CONVERTING AVAILABLE VALUE 0 TO 9


mapList = [[] * 10 for _ in range(10)]
# 1 1 1 1 1 1 1 1 1 1
# 1 0 0 0 1 0 1 1 0 1 like this 

for i in range(10) :
    mapList[i] = list(map(int, input().split()))

x = 1
y = 1

while True:
    if mapList[x][y] == 2:
        mapList[x][y] = 9
        break
    
    if mapList[x][y+1] != 1:
        mapList[x][y] = 9
        y += 1
      
    else:
        if mapList[x+1][y] != 1:
            mapList[x][y] = 9
            x += 1
    
        else:
            mapList[x][y] = 9
            break


for i in range(10) :
    for j in range(10) :
        print(mapList[i][j], end = ' ')
    print()
