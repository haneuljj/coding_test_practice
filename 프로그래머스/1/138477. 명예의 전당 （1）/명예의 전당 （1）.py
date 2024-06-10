def solution(k, score):
    # k길이의 리스트: 명예의 전당 리스트
    k_list = []
    # 최솟값을 담을 리스트
    result = []
    
    for i in range(len(score)):
        # 명예의 전당 리스트의 길이가 다 안찼을 때
        if len(k_list) < k:
            # 값 추가
            k_list.append(score[i])
            # 오름차순 정렬
            k_list.sort()
        
        # 명예의 전당 리스트의 길이가 다 찼을 때
        else:
            # 새로 들어온 값이 명예의 전당의 제일 작은 값보다 크다면
            if score[i] > k_list[0]:
                # 제일 작은 값을 빼고
                k_list.pop(0)
                # 새로운 값 추가
                k_list.append(score[i])
                # 오름차순 정렬
                k_list.sort()
        
        # 명예의 전당에서 최솟값은 결과 리스트에 추가 
        result.append(k_list[0])
    
    return result
