attendence = []
for i in range(31): # 0번째 인덱스 사용 안함
    attendence.append(0)
# attendence = [0] * 31

for i in range(28):
    attend_num = int(input())
    attendence[attend_num] = 1

answer = []
for i in range(1, 31):
    if attendence[i] == 0:
        answer.append(i)

print(answer[0])
print(answer[1])