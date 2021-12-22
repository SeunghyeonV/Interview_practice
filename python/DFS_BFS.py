# DFS
# Use stack!

def dfs(graph, v, visited):
    # set current node as visited
    visited[v] = True
    print(v, end = ' ')
    
    # recursively visit the adjacent nodes from current node
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)
            
graph = [
    [], 
    [2,3,8], # nodes connected to node 1
    [1,7], # nodes connected to 2
    [1,4,5], # ...
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
    ]

visited = [False] * 9
print(dfs(graph, 1, visited))

#BFS 
# use queue

from collections import deque

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    # repeat until queue is empty
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
               
                
graph = [
    [], 
    [2,3,8], # nodes connected to node 1
    [1,7], # nodes connected to 2
    [1,4,5], # ...
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
    ]

visited = [False] * 9
print(bfs(graph, 1, visited))
