from itertools import permutations

N = int(input())
numbers = list(map(int, input().split()))

max = 0
for a in list(permutations(numbers, N)):
    sum = 0
    for i in range(N - 1):
        sum += abs(a[i] - a[i+1])
    if max < sum:
        max = sum

print(max)