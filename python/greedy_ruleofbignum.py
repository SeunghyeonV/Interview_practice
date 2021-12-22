'''
N = number of data, 
M = total number of addition, 
K = maximum addition of same data 

Greedy algorithm - return the largest number 
by using N given numbers up to K times repeatedly.
Maximum number of addition is M.

ex)
5 8 3
2 4 5 4 6
answer will be 6+6+6+5+6+6+6+5 = 46
'''

N, M, K = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
num = M // K
remainder = M % K

solution = 0
solution += (K*num)*data[-1]
solution += remainder*data[-2]
print(solution)
