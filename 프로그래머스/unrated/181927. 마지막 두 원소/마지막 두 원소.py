def solution(num_list):
    answer = num_list.copy()
    a = num_list[-1]
    b = num_list[-2]
    answer.append(a-b if a>b else a*2)
    return answer