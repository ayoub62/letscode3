from heapq import *
from collections import deque

for _ in range(int(input())):
    n = int(input())
    
    days = []
    h = []
    result = 0
    
    for _ in range(n):
        l = [int(item) for item in input().split()]
        days.append(l)
    
    days = deque(sorted(days))
    
    nxt = days.popleft()
    if nxt[0] == 0: heappush(h, [nxt[1], - nxt[2]])
    day = 0
    
    while h:
        
        if h[0][1] == 0 or h[0][0] < day:
            heappop(h)
            continue
        
        dist = min(h[0][0] - day + 1, -h[0][1])
        if days: dist = min(dist, days[0][0] - day)
        
        h[0][1] += dist
        result += dist
        day += dist
        
        if days and result == days[0][0]:
            nxt = days.popleft()
            day = nxt[0]
            heappush(h, [nxt[1], - nxt[2]])
        
    print(result)