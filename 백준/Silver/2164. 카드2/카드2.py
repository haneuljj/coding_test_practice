from collections import deque


N = int(input())

d = deque([])
for i in range(1, N+1):
    d.append(i)


while True:
    # 마지막 한 장 남으면 종료
    if len(d) == 1:
        break
    
    # 제일 위에 있는 거 버리기
    d.popleft()

    # 제일 위에 있는 거 아래로 옮기기
    d.append(d.popleft())


for i in d:
    print(i)