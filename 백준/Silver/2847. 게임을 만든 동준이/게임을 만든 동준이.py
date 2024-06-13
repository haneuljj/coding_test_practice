N = int(input())

level_scores = []
for i in range(N):
    level_scores.append(int(input()))

decrease_amount = 0

# 뒤에서 두번째에서 부터 하나씩 앞으로 가면서 확인
for i in range(N - 2, -1, -1): 
    if level_scores[i] >= level_scores[i + 1]: # 뒤의 값보다 크거나 같다면
        decrease_amount += level_scores[i] - (level_scores[i + 1] - 1) # 현재 값에서 뒤의값의-1 값이되도록 감소
        level_scores[i] = level_scores[i + 1] - 1 # 다음 반복의 뒤의값이 될 값 업데이트

print(decrease_amount)