# 풀이
# A배열을 가리키는 것(a) > B배열을 가리키는 것(b) 이면 B배열 포인터 이동
# a <= b이면, A배열 포인터 이동, 답 += sub인덱스(앞에 있는 원소 개수)
T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    A = sorted(A)
    B = sorted(B)

    main = 0 # A배열 포인터
    sub = 0 # B배열 포인터
    count = 0

    # A 배열의 값을 다 돌때까지
    while main < N:
        # sub가 끝에 도달하면
        if sub == M:
            count += sub # 모든 B종 먹을 수 있음
            main += 1

        else:
            if A[main] > B[sub]: # A종이 B종보다 크면
                sub += 1 # B종 포인터 이동
            else:
                count += sub # 지금까지 이동된 앞의 원소 개수들 합해주기
                main += 1 # A종 포인터 이동
                
    print(count)