# 탐색하려는 값: 블루레이의 용량의 최적일 때 
# 탐색범위: [영상길이의 최댓값, 영상길이의 합]

N, M = map(int, input().split())
videos = list(map(int, input().split()))

# 탐색범위 설정
left = max(videos)
right = sum(videos)
answer = -1

while left <= right:
    middle = (left + right) // 2 # 임시 블루레이 용량

    bluray_num = 1  # 블루레이 넘버
    remain = middle # 넣을 수 있는 용량 초기설정 -> 임시 용량 만큼 넣을 수 있음

    for i in range(N):
        if remain < videos[i]: # 남은 용량으로 못 넣을 경우
            bluray_num += 1 # 다음 블루레이에 넣기
            remain = middle # 넣을 수 있는 용량 초기화

        remain -= videos[i] # 남은 용량으로 넣을 수 있다면 -> 해당 비디오 길이 만큼 차감

    if bluray_num <= M:  # 지정된 블루레이 수만큼 넣을 수 있다면
        answer = middle 
        right = middle - 1  # 탐색범위 수정 -> 더 최소 용량으로도 넣을 수도 있기에 최댓값 줄이기
    else:  # 블루레이가 부족하다면
        left = middle + 1 # 탐색 범위 수정 -> 더 큰 용량이 필요하기에 최솟값 늘리기

print(answer)