from collections import deque
import sys

n = int(input())
d = deque([])

for i in range(n):
    command = sys.stdin.readline()  # input()은 느림
    command = command.split()
    
    # push X
    if command[0] == "push":
        # num = int(command[1])
        d.append(command[1])

    # pop
    if command[0] == "pop":
        if len(d) == 0:
            print(-1)
        else:
            print(d.popleft())

    # size
    if command[0] == "size":
        print(len(d))

    # empty
    if command[0] == "empty":
        if len(d) == 0:
            print(1)
        else:
            print(0)

    # front
    if command[0] == "front":
        if len(d) == 0:
            print(-1)
        else:
            print(d[0])

    # back
    if command[0] == "back":
        if len(d) == 0:
            print(-1)
        else:
            print(d[-1])