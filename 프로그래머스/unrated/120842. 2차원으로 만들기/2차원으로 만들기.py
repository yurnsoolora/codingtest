def solution(num_list, n):
    answer = []  # 빈 리스트로 초기화
    
    for i in range(0, len(num_list), n):
        sublist = []  # 하위 리스트 초기화
        for j in range(n):
            if i + j < len(num_list):
                sublist.append(num_list[i + j])  # 하위 리스트에 값을 추가
        answer.append(sublist)  # 결과 리스트에 하위 리스트 추가
        
    return answer
