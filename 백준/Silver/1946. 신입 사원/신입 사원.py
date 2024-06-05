import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    total_score = []  # 서류, 면접 모두 담을 리스트

    # 각 지원자의 점수를 총 리스트에 넣기
    for _ in range(N):
        score = list(map(int, input().split()))
        total_score.append(score)

    # 첫번째 열 기준으로 정렬하기
    total_score.sort()
    
    #### 비교대상의 값 앞의 모든 값을 비교할 필요x -> 모두 비교하면 시간복잡도가 똑같이 O(N^) -> 비효율
    #### 앞의 애들에서 최고성적을 갱신하여 그거보다 작은지를 확인 -> 시간복잡도 O(N)

    # 첫 번째 지원자는 무조건 선발
    result = 1
    best_interview_score = total_score[0][1]

    # 두번째 지원자부터 비교
    for i in range(1, N):
        if total_score[i][1] < best_interview_score:  # 앞의 값보다 작으면
            result += 1
            best_interview_score = total_score[i][1]  # 앞의 애들의 최고 면접 성적 갱신

    print(result)