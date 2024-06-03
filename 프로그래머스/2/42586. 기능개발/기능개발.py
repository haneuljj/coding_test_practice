import math
from collections import deque

def solution(progresses, speeds):
    answer = []
    
    # 각 작업의 소요일 확인
    dates = deque([])
    for i in range(len(progresses)):
        date = math.ceil((100 - progresses[i]) / speeds[i])
        dates.append(date)
    
    cnt = 0 # 한번에 배포될 기능의 개수 담는 변수
    while dates:

        first = dates.popleft() # 기준값
        cnt = 1
        
        # 데크가 비어있지 않고 첫번째 값이 기준 값보다 작거나 같으면 -> 기능 개수 추가 
        while dates and dates[0] <= first:
            dates.popleft()
            cnt += 1
                    
        answer.append(cnt)
    
    return answer