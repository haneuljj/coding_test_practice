S = input()

alpha = [-1] * 26

for i in range(len(S)):
    index = ord(S[i]) - ord('a')
    if alpha[index] == -1:
        alpha[index] = i

for i in alpha:
    print(i, end=" ")