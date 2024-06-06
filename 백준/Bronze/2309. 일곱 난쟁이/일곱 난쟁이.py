from itertools import combinations
import sys
input = sys.stdin.readline

heights = []
for i in range(9):
    heights.append(int(input()))

seven_heights = list(combinations(heights, 7))

for i in seven_heights:
    if sum(i) == 100:
        # 정렬해서 출력
        for height in sorted(i):
            print(height)
        break