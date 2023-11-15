def solution(n):
    answer = []

    for i in range(1, n+1):
        if n % i == 0:
            answer.append(i)
            # if i not in answer:  # 중복 약수를 방지하기 위해
            #     answer.append(n//i)
    
    answer.sort()
    return answer