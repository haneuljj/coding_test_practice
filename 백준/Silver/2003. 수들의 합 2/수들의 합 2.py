# 풀이
# 시작점 고정, 끝점을 한칸씩 옮기기
# 만약 합이 M이상이면 시작점 + 1
N, M = map(int, input().split())
A = list(map(int, input().split()))

start = 0 # 시작점
end = 0 # 끝점
sum = A[0] # 시작점 ~ 끝점의 구간합

count = 0
while True:
    # 현재 구간이 합이 M인지 확인
    if sum == M:
        count += 1

    # 구간 업데이트
    if sum >= M:
        start += 1
        sum -= A[start - 1]
    else:
        # 끝점이 이미 끝에 도달했을 때
        if end == N - 1:
            break

        end += 1
        sum += A[end]
    
print(count)